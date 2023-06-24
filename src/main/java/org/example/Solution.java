package org.example;
public class Solution {
    /**
     * Counts the number of jewels present in the stones.
     *
     * @param jewels The string representing the types of jewels.
     * @param stones The string representing the stones you have.
     * @return The count of jewels found in stones.
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
