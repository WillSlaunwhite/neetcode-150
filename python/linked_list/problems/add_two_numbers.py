from typing import Optional

from linked_list.list_node import ListNode


def add_two_numbers(
    l1: Optional[ListNode], l2: Optional[ListNode]
) -> Optional[ListNode]:
    dummy: Optional[ListNode] = ListNode(0)
    cur: Optional[ListNode] = dummy
    carry: int = 0

    while l1 or l2 or carry:
        x: int = l1.val if l1 else 0
        y: int = l2.val if l2 else 0
        sum: int = x + y + carry
        carry = sum // 10
        cur.next = ListNode(sum % 10)
        if l1:
            l1 = l1.next
        if l2:
            l2 = l2.next
        cur = cur.next
    return dummy.next
