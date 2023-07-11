from typing import Optional
from linked_list.problems.reorder_list import reorder_list
from linked_list.list_node import ListNode


def test_reorder_list_first_case(
    convert_array_to_linked_list, convert_linked_list_to_array
) -> None:
    head: Optional[ListNode] = convert_array_to_linked_list([1, 2, 3, 4])
    expected_output = [1, 4, 2, 3]

    result = reorder_list(head)
    assert convert_linked_list_to_array(result) == expected_output


def test_reorder_list_second_case(
    convert_array_to_linked_list, convert_linked_list_to_array
) -> None:
    head: Optional[ListNode] = convert_array_to_linked_list([1, 2, 3, 4, 5])
    expected_output = [1, 5, 2, 4, 3]

    result = reorder_list(head)
    assert convert_linked_list_to_array(result) == expected_output
