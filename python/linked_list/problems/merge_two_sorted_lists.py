from typing import Any, Optional
from linked_list.list_node import ListNode


def merge_two_sorted_lists_iterative(
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
    head: Optional[ListNode] = ListNode(0)
    prev: Optional[ListNode] = head

    while list1 and list2:
        if list1.val < list2.val:
            prev.next = list1
            list1 = list1.next
        else:
            prev.next = list2
            list2 = list2.next
        prev = prev.next
    prev.next = list1 or list2

    return head.next


def merge_two_sorted_lists_recursive(
    list1: Optional[ListNode], list2: Optional[ListNode]
) -> Optional[ListNode]:
    if not list1 or not list2:
        return list1 or list2

    if list1.val < list2.val:
        list1.next = merge_two_sorted_lists_recursive(list1.next, list2)
        return list1
    else:
        list2.next = merge_two_sorted_lists_recursive(list1, list2.next)
        return list2
