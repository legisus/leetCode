import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        char[] pCharArr = p.toCharArray();
        Arrays.sort(pCharArr);
        String sortedP = new String(pCharArr);

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            String temp = s.substring(i, i + p.length());
            char[] tempArr = temp.toCharArray();
            Arrays.sort(tempArr);
            String sortedTemp = new String(tempArr);
            if(sortedP.equals(sortedTemp)){
                res.add(i);
            }
        }
        return res;
    }


        /*
    438. Find All Anagrams in a String
Medium
10.6K
305
Companies
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".


Constraints:
     */

}
