from typing import Optional
from linked_list.problems.remove_nth_node_from_end import remove_nth_node_from_end
from linked_list.list_node import ListNode


def test_remove_nth_node_first_case(
    convert_linked_list_to_array, convert_array_to_linked_list
) -> None:
    head: Optional[ListNode] = convert_array_to_linked_list([1, 2, 3, 4, 5])
    expected_output: list[int] = [1, 2, 3, 5]
    result: Optional[ListNode] = remove_nth_node_from_end(head, 2)

    assert expected_output == convert_linked_list_to_array(result)
