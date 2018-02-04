/**
 * @Author lpf
 * @Date 2/5/18 1:09 AM
 */
public class ArrangingCoins441 {
    public int arrangeCoins(int n) {
        return (int)Math.floor(Math.sqrt(2.0*n + 1.0/4) + 1.0/2);
    }

    public static void main(String[] args) {
        System.out.println(new ArrangingCoins441().arrangeCoins(2146467959));
    }
}
