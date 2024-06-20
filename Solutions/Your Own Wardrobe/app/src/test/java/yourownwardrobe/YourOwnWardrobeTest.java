package yourownwardrobe;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class YourOwnWardrobeTest {

    @Test
    void testFindCombinations() {
        YourOwnWardrobe wardrobe = new YourOwnWardrobe();
        List<List<Integer>> combinations = wardrobe.findCombinations(250);
        assertNotNull(combinations);
    }

    @Test
    public void testCalculateCost() {
        YourOwnWardrobe wardrobe = new YourOwnWardrobe();
        int cost = wardrobe.calculateCost(Arrays.asList(50, 75, 100, 25));
        assertEquals(211, cost);
    }

    @Test
    void testFindCheapestCombination() {
        YourOwnWardrobe wardrobe = new YourOwnWardrobe();
        List<List<Integer>> combinations = wardrobe.findCombinations(250);
        List<Integer> cheapestCombination = wardrobe.findCheapestCombination(combinations);
        assertNotNull(cheapestCombination);
        int cost = wardrobe.calculateCost(cheapestCombination);
        System.out.println("Cheapest combination: " + cheapestCombination);
        System.out.println("Cost: " + cost);
    }


}
