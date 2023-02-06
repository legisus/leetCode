public class ConcatenationArray {

    public int[] getConcatenation(int[] nums) {
        int[] r = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            r[i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            r[nums.length + i] = nums[i];
        }
        return r;
    }
}
