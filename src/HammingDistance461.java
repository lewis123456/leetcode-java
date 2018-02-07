/**
 * @Author lpf
 * @Date 2/8/18 1:26 AM
 */
public class HammingDistance461 {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        int result = 0;
        while (z != 0) {
            if (1 == z % 2) {
                ++result;
            }
            z = z >> 1;
        }
        return result;
    }
}
