from typing import Optional

from linked_list.list_node import ListNode


def remove_nth_node_from_end(head: Optional[ListNode], n: int) -> Optional[ListNode]:
    if not head:
        return None

    dummy: Optional[ListNode] = ListNode(0, head)
    right: Optional[ListNode] = head

    while n > 0:
        right = right.next if right else None
        n -= 1

    left: Optional[ListNode] = dummy
    while right:
        left = left.next if left else None
        right = right.next

    if left and left.next:
        left.next = left.next.next

    return dummy.next
