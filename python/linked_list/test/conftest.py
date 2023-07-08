from typing import Any, Callable, Optional
import pytest

from linked_list.list_node import ListNode


@pytest.fixture
def convert_array_to_linked_list() -> Callable[..., Optional[ListNode]]:
    def _convert_array_to_linked_list(arr) -> Optional[ListNode]:
        dummy: Optional[ListNode] = ListNode(0)
        ptr = dummy
        for val in arr:
            ptr.next = ListNode(val)
            ptr = ptr.next
        return dummy.next

    return _convert_array_to_linked_list


@pytest.fixture
def convert_linked_list_to_array() -> Callable[..., list[Any]]:
    def _convert_linked_list_to_array(node) -> list:
        arr = []
        while node:
            arr.append(node.val)
            node = node.next
        return arr

    return _convert_linked_list_to_array
