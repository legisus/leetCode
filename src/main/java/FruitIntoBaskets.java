import java.util.*;

public class FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int maxCount = 0;

        Map<Integer, Integer> fruitCount = new HashMap<>();

        while (right < fruits.length) {
            fruitCount.put(fruits[right], fruitCount.getOrDefault(fruits[right], 0) + 1);
            while (fruitCount.size() > 2) {
                fruitCount.put(fruits[left], fruitCount.get(fruits[left]) - 1);
                if (fruitCount.get(fruits[left]) == 0) {
                    fruitCount.remove(fruits[left]);
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
            right++;

        }
        return maxCount;

    }


    /*
    slide
    public int totalFruit(int[] fruits) {
    int maxFruits = 0, i = 0;
    int[] fruitCount = new int[fruits.length];
    for (int j = 0; j < fruits.length; j++) {
        fruitCount[fruits[j]]++;
        while (fruitCount[fruits[j]] > 0 && getDistinctCount(fruitCount) > 2) {
            fruitCount[fruits[i]]--;
            i++;
        }
        maxFruits = Math.max(maxFruits, j - i + 1);
    }
    return maxFruits;
}

private int getDistinctCount(int[] fruitCount) {
    int count = 0;
    for (int i = 0; i < fruitCount.length; i++) {
        if (fruitCount[i] > 0) {
            count++;
        }
    }
    return count;
}
     */


    public static void main(String[] args) {
        FruitIntoBaskets f = new FruitIntoBaskets();
        System.out.println(f.totalFruit(new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4}));
    }


























































    /*
    904. Fruit Into Baskets
Medium
2.3K
167
Companies
You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
Given the integer array fruits, return the maximum number of fruits you can pick.



Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.
Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].
Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].


Constraints:

1 <= fruits.length <= 105
0 <= fruits[i] < fruits.length
Accepted
266.9K
Submissions
621.7K
Acceptance Rate
42.9%
     */
}
