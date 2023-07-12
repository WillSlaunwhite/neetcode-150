from typing import Optional

from linked_list.list_node import ListNode


def swap_nodes(head: Optional[ListNode], k: int) -> Optional[ListNode]:
    left = right = head
    while k > 1 and right:
        right: Optional[ListNode] = right.next
        k -= 1
    dummy: Optional[ListNode] = right
    while dummy and dummy.next and left:
        left: Optional[ListNode] = left.next
        dummy = dummy.next
    if right and left:
        temp: int = right.val
        right.val = left.val
        left.val = temp
    return head
