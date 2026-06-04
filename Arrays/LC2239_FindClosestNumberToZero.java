//  Find Closest Number to Zero
  
public class LC2239_FindClosestNumberToZero {

    public static int findClosestNumber(int[] nums) {

        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];
            } else if (Math.abs(nums[i]) == Math.abs(closest)
                    && nums[i] > closest) {
                closest = nums[i];
            }
        }

        return closest;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -2, 1, 4, 8};

        System.out.println(findClosestNumber(nums));
    }
}

/*
LeetCode: 2239
Title: Find Closest Number to Zero

Pattern:
- Running Best Candidate

Approach:
- Store first element as closest
- Compare absolute values
- If equal distance from zero, choose larger number

Time Complexity: O(n)
Space Complexity: O(1)
*/
