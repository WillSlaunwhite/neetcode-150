from typing import Optional
from linked_list.list_node import ListNode


def reverse_linked_list_iterative(head: Optional[ListNode]) -> Optional[ListNode]:
    """
    Reverse the input linked list recursively.

    Args:
        head (ListNode): the head of the linked list.

    Returns:
        ListNode: the head of the reversed list.

    """

    prev: Optional[ListNode] = None
    while head != None:
        next: Optional[ListNode] = head.next
        head.next = prev
        prev = head
        head = next
    return prev


def reverse(
    current: Optional[ListNode], prev: Optional[ListNode] = None
) -> Optional[ListNode]:
    """
    Reverse the input linked list iteratively

    Args:
        head (Optional[ListNode]): the head of the linked list.

    Returns:
        Optional[ListNode]: the head of the reversed list.
    """
    if not current:
        return prev

    next: Optional[ListNode] = current.next
    current.next = prev
    return reverse(next, current)


def reverse_linked_list_recursive(head: Optional[ListNode]) -> Optional[ListNode]:
    """
    calls the method to reverse the linked list recursively

    Args:
        head (Optional[ListNode]): the head of the linked list

    Returns:
        Optional[ListNode]: the head of the reversed
    """
    return reverse(head)
