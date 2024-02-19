from arrays.problems.is_anagram import is_anagram

def test_is_anagram_first_case() -> None:
    s = "rat"
    t = "car"
    assert is_anagram(s, t) == False

def test_is_anagram_second_case() -> None:
    s = "anagram"
    t = "nagaram"
    assert is_anagram(s, t) == True