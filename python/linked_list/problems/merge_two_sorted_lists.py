from typing import Optional
from python.linked_list.list_node import ListNode


def merge_two_sorted_lists(
    list1: Optional[ListNode], list2: Optional[ListNode]
) -> Optional[ListNode]:
    """
    Given the heads of two sorted linked lists, return the head of
    a single sorted list

    Args:
        list1 (Optional[ListNode]): head of first list
        list2 (Optional[ListNode]): head of second list

    Returns:
        head of a single sorted list
    """
    head: ListNode = ListNode(0)
    prev: ListNode = head

    while list1 and list2:
        if list1.val < list2.val:
            prev.next = list1
            list1 = list1.next
        else:
            prev.next = list2
            list2 = list2.next
        prev = prev.next
    prev.next = list1 if list1 != None else list2

    return head.next
