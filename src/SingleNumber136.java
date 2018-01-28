/**
 * @Author lpf
 * @Date 1/28/18 11:28 PM
 */
public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i=1; i<nums.length; ++i) {
            result = result ^ nums[i];
        }
        return result;
    }
}
