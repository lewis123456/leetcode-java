import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/27/18 11:29 AM
 */
public class TwoSum001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for (int i=0; i<nums.length; ++i) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(target-nums[i], i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        int target;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<4; ++i) {
            nums[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        TwoSum001 twoSum = new TwoSum001();
        int [] result = twoSum.twoSum(nums, target);
        System.out.println(result[0] + ", " + result[1]);
    }
}
