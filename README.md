# LeetCode 42. Trapping Rain Water Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-42-trapping-rain-water-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-42-trapping-rain-water-java.html

## Problem

[Trapping Rain Water - LeetCode](https://leetcode.com/problems/trapping-rain-water/?envType=featured-list&envId=top-interview-questions)

### Problem-solving approach

- At least three elements (1, 0, 1) are required to hold water, so we need a minimum of three elements.
- Algorithm
![00](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution/blob/master/photo/00.png)

- We find the highest blocks on the left and right sides with respect to the position we want to check.

![01](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution/blob/master/photo/01.png)

- We can fill water up to the minimum of these two heights.
- Now, we subtract the block's height at the position to get the height of the water that can be filled.

![02](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution/blob/master/photo/02.png)

- Repeat the process for all positions.
- To use the above algorithm, we need to loop in advance to get the highest block on the right and left.

![03](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution/blob/master/photo/03.png)

- Below, you can see the necessary values for each position.

![04](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution/blob/master/photo/04.png)

## Github Link

[https://github.com/eunhanlee/LeetCode_42_TrappingRainWater_Solution.git](https://github.com/eunhanlee/LeetCode_42_TrappingRainWater_Solution.git)

## Time Complexity: O(n), Space Complexity: O(n)

```java
public class Solution {
    /**
     * Calculates the amount of water that can be trapped between bars.
     *
     * @param height An array representing the height of the bars
     * @return The total amount of water trapped between bars
     */
    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        // An array to store the maximum heights of the bars on the left side of each index
        int[] leftMax = new int[n];
        // An array to store the maximum heights of the bars on the right side of each index
        int[] rightMax = new int[n];
        // A variable to store the total amount of trapped water
        int maxWater = 0;

        // Calculate the maximum heights of the bars on the left side of each index
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Calculate the maximum heights of the bars on the right side of each index
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // Calculate the trapped water for each bar
        for (int i = 1; i < n - 1; i++) {
            // Find the minimum height between the current bar's left and right highest bars
            int minBarHeight = Math.min(leftMax[i], rightMax[i]);
            // If the minimum bar height is greater than the current bar's height,
            // water can be trapped on top of the current bar.
            if (minBarHeight > height[i]) {
                // The trapped water amount is the difference between the minimum bar height and the current bar's height.
                maxWater += minBarHeight - height[i];
            }
        }

        // Return the total amount of trapped water.
        return maxWater;
    }
}
```
