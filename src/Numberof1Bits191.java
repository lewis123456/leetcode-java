/**
 * @Author lpf
 * @Date 2/1/18 1:09 AM
 */
public class Numberof1Bits191 {
    public int hammingWeight(int n) {
        int sum = 0;
        long tmp = 0;
        long p = 1;
        while (p<=n) {
            tmp = p & n;
            if (p == tmp) {
                ++sum;
            }
            if (p <= Integer.MAX_VALUE) {
                p = p << 1;
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("result: " + new Numberof1Bits191().hammingWeight(2147482648));
    }
}
