package org.example;

public class Main {
    public static void main(String[] args) {
        Solution tt = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(tt.numJewelsInStones(jewels,stones)); //3
    }
}