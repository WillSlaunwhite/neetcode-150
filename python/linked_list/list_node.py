from typing import Optional


class ListNode:
    def __init__(self, val: int, next: Optional["ListNode"] = None) -> None:
        self.val = val
        self.next = next

    def __eq__(self, other) -> bool:
        if isinstance(other, ListNode):
            return self.val == other.val and self.next == other.next
        return False
