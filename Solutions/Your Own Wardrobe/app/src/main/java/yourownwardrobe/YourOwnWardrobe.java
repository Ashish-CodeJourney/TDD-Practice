package yourownwardrobe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YourOwnWardrobe {

    private static final List<Integer> ELEMENTS = Arrays.asList(50, 75, 100, 120);
    public List<List<Integer>> findCombinations(int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinationsHelper(result, new ArrayList<>(), target, 0);
        return result;
    }

    private void findCombinationsHelper(List<List<Integer>> result, List<Integer> combination, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i < ELEMENTS.size(); i++) {
            if (target >= ELEMENTS.get(i)) {
                combination.add(ELEMENTS.get(i));
                findCombinationsHelper(result, combination, target - ELEMENTS.get(i), i);
                combination.remove(combination.size() - 1);
            }
        }
    }

    public int calculateCost(List<Integer> combination) {
        int cost = 0;
        for (int element : combination) {
            switch (element) {
                case 50:
                    cost += 59;
                    break;
                case 75:
                    cost += 62;
                    break;
                case 100:
                    cost += 90;
                    break;
                case 120:
                    cost += 111;
                    break;
            }
        }
        return cost;
    }

    public List<Integer> findCheapestCombination(List<List<Integer>> combinations) {
        List<Integer> cheapestCombination = null;
        int minCost = Integer.MAX_VALUE;
        for (List<Integer> combination : combinations) {
            int cost = calculateCost(combination);
            if (cost < minCost) {
                minCost = cost;
                cheapestCombination = combination;
            }
        }
        return cheapestCombination;
    }
}
