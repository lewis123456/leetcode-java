/**
 * @Author lpf
 * @Date 1/27/18 5:05 PM
 */
public class RemoveDuplicatesfromSortedArray026 {
    public int removeDuplicates(int[] nums) {
        if (null == nums) {
            return 0;
        }
        if (1 == nums.length) {
            return 1;
        }
        int dulicateNum = 0;
        int index = 0;
        do {
            while (index < nums.length-1 && nums[index] != nums[index+1]) {
                ++index;
            }
            while (index < nums.length-1 && nums[index] == nums[index+1]) {
                ++dulicateNum;
                ++index;
            }
        }while (index < nums.length);

        index = 0;
        int j = 0;
        int p = 0;
        int q = 0;
        do {
            while(index < nums.length-1 && nums[index] != nums[index+1]) {
                ++index;
            }
            j = index + 1;
            while (index < nums.length-1 && nums[index] == nums[index+1]) {
                ++index;
            }
            p = index + 1;
            while (index < nums.length-1) {

            }

        } while (index < nums.length);

        return nums.length - dulicateNum;
    }
}
