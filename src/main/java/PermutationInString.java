import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        char[] tempArrays1 = s1.toCharArray();
        Arrays.sort(tempArrays1);
        String sortedS1 = new String(tempArrays1);

        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String temp = s2.substring(i, i + s1.length());
            char[] tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            String sortedtemp = new String(tempArray);
            if (sortedS1.equals(sortedtemp)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PermutationInString pp = new PermutationInString();

        System.out.println(pp.checkInclusion("abc", "cbaebabacd"));

        System.out.println();
    }
























    /*
    567. Permutation in String
Medium
9K
283
Companies
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.



Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false


Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
Accepted
592K
Submissions
1.3M
Acceptance Rate
44.3%
     */





}
