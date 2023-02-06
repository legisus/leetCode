public class Solution {
    public int numIdenticalPairs(int[] nums) {
        int countOfGoodPairs = 0;
        if(1<= nums.length || nums.length <= 100) {

            for (int i = 0; i < nums.length; i++) {
              if (1 <= nums[i] || nums[i] <= 100) {

                    for (int j = i+1; j < nums.length; j++) {

                        if(nums[i] == nums[j]){
                            countOfGoodPairs++;
                        }

                    }

                }
            }
        }
        return countOfGoodPairs;
    }

}
