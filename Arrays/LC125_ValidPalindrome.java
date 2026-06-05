/*
LeetCode: 125
Title: Valid Palindrome

Pattern:
Two Pointers + Skip Invalid Characters

Approach:

1. Place one pointer at the beginning.
2. Place one pointer at the end.
3. Skip non-alphanumeric characters.
4. Convert characters to lowercase.
5. Compare both characters.
6. If they don't match, return false.
7. Move both pointers inward.
8. If all comparisons pass, return true.

Time Complexity: O(n)
Space Complexity: O(1)

Java Methods Learned:

Character.isLetterOrDigit(ch)
- Returns true if character is a letter or digit.

Character.toLowerCase(ch)
- Converts uppercase character to lowercase.

Key Learning:
When a problem says:
- Ignore spaces
- Ignore punctuation
- Ignore special characters

Think:
Character.isLetterOrDigit()
*/

public class LC125_ValidPalindrome {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            char leftChar =
                    Character.toLowerCase(s.charAt(left));

            char rightChar =
                    Character.toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        LC125_ValidPalindrome solution =
                new LC125_ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        System.out.println(solution.isPalindrome(s));
    }
}
