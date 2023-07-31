# LeetCode 771. Jewels and Stones Java Solution

Hashnode Link: https://eunhanlee.hashnode.dev/leetcode-771-jewels-and-stones-java-solution

Blogger link: https://eunhanspace.blogspot.com/2023/07/leetcode-771-jewels-and-stones-java.html

## Problem

[Jewels and Stones - LeetCode](https://leetcode.com/problems/jewels-and-stones/)

### Solution Approach

- This problem is about checking whether each character from one input string exists in another input string.
- Since each character needs to be checked at least once, the time complexity is O(n^2), where n is the length of the input string.
- It tests your basic string handling skills.
- To solve it, you need to understand the `toCharArray()` method and how to compare characters using the char data type in Java.

[Java's Primitive Data Types and Reference Data Types](https://eunhanspace.blogspot.com/2023/07/javas-primitive-data-types-and.html) 

## Github Link

[https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution.git](https://github.com/eunhanlee/LeetCode_771_JewelsandStones_Solution.git)

## Time Complexity: O(n^2), Space Complexity: O(1)

```java
class Solution {
    /**
     * Method to count the number of jewels in the stones.
     *
     * @param jewels The string representing types of jewels.
     * @param stones The string representing the stones you have.
     * @return The number of jewels found in the stones.
     */
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;

        for (char stone : stones.toCharArray()) {
            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    counter++;
                }
            }
        }

        return counter;
    }
}

```
