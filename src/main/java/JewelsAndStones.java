import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> uniq = new HashSet<Character>();

        for (char ch: jewels.toCharArray()) {
            uniq.add(ch);
        }

        int count = 0;

        for (char ch : stones.toCharArray()) {
            if(uniq.contains(ch)) {
                count += 1;
            }
        }

        return count;

    }





































/*
771. Jewels and Stones
Easy
4.3K
527
Companies
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".



Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0


Constraints:

1 <= jewels.length, stones.length <= 50
jewels and stones consist of only English letters.
All the characters of jewels are unique.
Accepted
832.6K
Submissions
944.7K
Acceptance Rate
88.1%
 */


}
