import org.example.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void testNumJewelsInStones() {
        Solution solution = new Solution();

        // Test Cases
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        // Expected result: 3
        Assertions.assertEquals(3, solution.numJewelsInStones(jewels1, stones1));

        String jewels2 = "z";
        String stones2 = "ZZ";
        // Expected result: 0
        Assertions.assertEquals(0, solution.numJewelsInStones(jewels2, stones2));

        String jewels3 = "abc";
        String stones3 = "abcabc";
        // Expected result: 6
        Assertions.assertEquals(6, solution.numJewelsInStones(jewels3, stones3));

        String jewels4 = "";
        String stones4 = "xyz";
        // Expected result: 0
        Assertions.assertEquals(0, solution.numJewelsInStones(jewels4, stones4));

        String jewels5 = "abc";
        String stones5 = "";
        // Expected result: 0
        Assertions.assertEquals(0, solution.numJewelsInStones(jewels5, stones5));

        String jewels6 = "";
        String stones6 = "";
        // Expected result: 0
        Assertions.assertEquals(0, solution.numJewelsInStones(jewels6, stones6));

        String jewels7 = "A";
        String stones7 = "BBBBBB";
        // Expected result: 0
        Assertions.assertEquals(0, solution.numJewelsInStones(jewels7, stones7));

        String jewels8 = "a";
        String stones8 = "aaaaaaa";
        // Expected result: 7
        Assertions.assertEquals(7, solution.numJewelsInStones(jewels8, stones8));

        String jewels9 = "ABC";
        String stones9 = "ABCabc";
        // Expected result: 3
        Assertions.assertEquals(3, solution.numJewelsInStones(jewels9, stones9));

        String jewels10 = "aA";
        String stones10 = "Aa";
        // Expected result: 2
        Assertions.assertEquals(2, solution.numJewelsInStones(jewels10, stones10));
    }
}
