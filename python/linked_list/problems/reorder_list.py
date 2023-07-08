from typing import Optional

from linked_list.list_node import ListNode

# * need to find better way to handle types than optionals


def reorder_list(head: Optional[ListNode]) -> Optional[ListNode]:
    slow: Optional[ListNode] = head if head else None
    fast: Optional[ListNode] = head.next if head else None
    while slow and fast:
        slow = slow.next
        fast = fast.next.next if fast.next else None
