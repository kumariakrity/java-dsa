/*
LeetCode: 1768
Title: Merge Strings Alternately

Pattern:
Two Pointers + StringBuilder

Approach:

1. Maintain two pointers:
   i -> word1
   j -> word2

2. Append one character from word1 and one from word2.

3. When one string finishes, append the remaining
   characters from the other string.

Time Complexity: O(n + m)
Space Complexity: O(n + m)

Java Notes:

StringBuilder:
- append(char)
- toString()

Two Pointer Traversal:
- One pointer for each string.

Key Learning:
When traversing two strings simultaneously,
maintain separate pointers and process the
remaining characters after one string ends.
*/

public class LC1768_MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i));
            i++;
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        LC1768_MergeStringsAlternately solution =
                new LC1768_MergeStringsAlternately();

        System.out.println(
                solution.mergeAlternately("abc", "pqr")
        );
    }
}
