/**
 * @Author lpf
 * @Date 2/2/18 11:02 PM
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        if (null == nums || 1 > nums.length) {
            return false;
        } else {
            int tmp;
            for (int i=0; i<nums.length-1; ++i){
                for (int j=0; j<nums.length-i-1; ++j) {
                    if (nums[j] == nums[j+1]) {
                        return true;
                    }

                    if (nums[j] > nums[j+1]) {
                        tmp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = tmp;
                    }
                }
            }
            return false;
        }
    }
}
