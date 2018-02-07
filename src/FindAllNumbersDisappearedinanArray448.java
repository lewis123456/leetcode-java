import java.util.ArrayList;
import java.util.List;

/**
 * @Author lpf
 * @Date 2/8/18 12:52 AM
 */
public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length; ++i) {
            temp = nums[i];
            if (temp < 0) {
                temp *= -1;
            }
            if (nums[temp-1] < 0) {
                continue;
            } else {
                nums[temp-1] *= -1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0) {
                result.add(i+1);
            }
        }

        return result;
    }
}
