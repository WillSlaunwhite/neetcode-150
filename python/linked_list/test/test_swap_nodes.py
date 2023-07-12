from typing import Optional
from linked_list.list_node import ListNode
from linked_list.problems.swap_nodes import swap_nodes


def test_swap_nodes_first_case(
    convert_linked_list_to_array, convert_array_to_linked_list
) -> None:
    head: ListNode = convert_array_to_linked_list([1, 2, 3, 4, 5])
    expected_output: list[int] = [1, 4, 3, 2, 5]
    assert expected_output == convert_linked_list_to_array(swap_nodes(head, 2))


def test_swap_nodes_second_case(
    convert_linked_list_to_array, convert_array_to_linked_list
) -> None:
    head: ListNode = convert_array_to_linked_list([7, 9, 6, 6, 7, 8, 3, 0, 9, 5])
    expected_output: list[int] = [7, 9, 6, 6, 8, 7, 3, 0, 9, 5]
    assert expected_output == convert_linked_list_to_array(swap_nodes(head, 5))
