from typing import Optional

from linked_list.list_node import ListNode

# * need to find better way to handle types than optionals


def reorder_list(head: Optional[ListNode]) -> Optional[ListNode]:
    if not head:
        return None

    slow: Optional[ListNode] = head if head else None
    fast: Optional[ListNode] = head.next if head else None
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next if fast.next else None

    second_half: Optional[ListNode] = slow.next
    slow.next = None
    prev: Optional[ListNode] = slow.next
    while second_half:
        next: Optional[ListNode] = second_half.next
        second_half.next = prev
        prev = second_half
        second_half = next

    first_half: Optional[ListNode] = head
    second_half = prev
    while second_half:
        first_temp: Optional[ListNode] = first_half.next
        second_temp: Optional[ListNode] = second_half.next
        first_half.next = second_half
        second_half.next = first_temp
        first_half = first_temp
        second_half = second_temp

    return head
