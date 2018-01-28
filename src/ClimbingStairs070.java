/**
 * @Author lpf
 * @Date 1/28/18 1:10 PM
 */
public class ClimbingStairs070 {
    public int climbStairs(int n) {
        if (1 == n) {
            return 1;
        }
        if (2 == n) {
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
