/*
LeetCode: 242
Title: Valid Anagram

Pattern:
Frequency Counting

Approach:

1. If lengths differ, return false.
2. Create frequency array of size 26.
3. Increment frequency for characters in s.
4. Decrement frequency for characters in t.
5. If any frequency is not zero, return false.
6. Otherwise return true.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:

Character to Index Mapping:

'a' -> 0
'b' -> 1
'c' -> 2
...
'z' -> 25

Formula:

ch - 'a'

Used For:
- Frequency Counting
- Hashing
- String Problems
*/

public class LC242_ValidAnagram {

    public boolean isAnagram(String s, String t) {

        int[] freq = new int[26];

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {

            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        LC242_ValidAnagram solution =
                new LC242_ValidAnagram();

        System.out.println(
                solution.isAnagram("anagram", "nagaram")
        );
    }
}
