public class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int closestIndex = 0;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; ++i) {
            int abs = Math.abs(nums[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            } else if (abs == diff && nums[i] > 0 && nums[closestIndex] < 0) {
                //same distance to zero but positive
                closestIndex =i;
            }
        }
        return nums[closestIndex];
    }
}
