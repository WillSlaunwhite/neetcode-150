from linked_list.list_node import ListNode
from linked_list.problems.reverse_linked_list import reverse_linked_list_recursive
from linked_list.problems.reverse_linked_list import reverse_linked_list_iterative


def test_reverse() -> None:
    input_list = convert_array_to_linked_list([1, 2, 3, 4, 5])
    expected_output = [5, 4, 3, 2, 1]

    result = reverse_linked_list_recursive(input_list)

    assert convert_linked_list_to_array(result) == expected_output


def test_reverse_empty_list() -> None:
    input_list = None
    expected_output = []

    result = reverse_linked_list_recursive(input_list)

    assert convert_linked_list_to_array(result) == expected_output


def convert_array_to_linked_list(arr) -> ListNode:
    dummy = ListNode(0)
    ptr = dummy
    for val in arr:
        ptr.next = ListNode(val)
        ptr = ptr.next
    return dummy.next


def convert_linked_list_to_array(node) -> list:
    arr = []
    while node:
        arr.append(node.val)
        node = node.next
    return arr
