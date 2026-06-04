/*
LeetCode: 414
Title: Third Maximum Number

Pattern:
Top K Tracking

Approach:
1. Maintain first, second, and third distinct maximum values.
2. Skip duplicates.
3. Shift values when a larger number is found.
4. If third distinct maximum does not exist, return the maximum number.

Time Complexity: O(n)
Space Complexity: O(1)

Key Learning:
Instead of sorting the entire array, track only the top 3 distinct values.
*/

public class LC414_ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            // Skip duplicates
            if (num == first || num == second || num == third) {
                continue;
            }

            if (num > first) {
                third = second;
                second = first;
                first = num;
            } 
            else if (num > second) {
                third = second;
                second = num;
            } 
            else if (num > third) {
                third = num;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }

    public static void main(String[] args) {

        LC414_ThirdMaximumNumber solution =
                new LC414_ThirdMaximumNumber();

        int[] nums = {2, 2, 3, 1};

        System.out.println(solution.thirdMax(nums));
    }
}
