/**
 * @Author lpf
 * @Date 2/1/18 12:30 AM
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        int n = nums.length;
        int sum1, sum2;
        int response;
        if (0 == n) {
            response = 0;
        } else if (0 < n) {
            if (0 < nums[0]) {
                sum1 = nums[0];
            } else {
                sum1 = 0;
            }
            response = sum1;
            if (1 < n) {
                if (nums[1] < sum1) {
                    sum2 = sum1;
                } else {
                    sum2 = nums[1];
                }
                response = sum2;
                for (int i=2; i<n; ++i) {
                    if (nums[i] + sum1 > sum2) {
                        response = nums[i] + sum1;
                    } else {
                        response = sum2;
                    }
                    sum1 = sum2;
                    sum2 = response;
                }
            } else {

            }
        } else {
            response = 0;
        }
        return response;
    }
}
