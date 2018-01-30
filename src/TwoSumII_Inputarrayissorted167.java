/**
 * @Author lpf
 * @Date 1/31/18 12:03 AM
 */
public class TwoSumII_Inputarrayissorted167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int p = 1, q = numbers.length;
        int sum = numbers[p-1] + numbers[q-1];
        while (sum != target) {
            if (sum < target) {
                ++p;
            } else {
                --q;
            }
            sum = numbers[p-1] + numbers[q-1];
        }
        result[0] = p;
        result[1] = q;
        return result;
    }
}
