import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/27/18 12:12 PM
 */
public class ReverseInteger007 {
    public int reverse(int x) {
        long xl = x > 0 ? x : -1*(x);
        long y = 0;
        while (0 != xl/10) {
            y = 10*y + xl%10;
            xl /= 10;
        }
        y = 10*y + xl%10;
        y = x > 0 ? y : -1*(y);
        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)y;
        }
    }

    public static void main(String[] args) {
        ReverseInteger007 reverseInteger007 = new ReverseInteger007();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(reverseInteger007.reverse(scanner.nextInt()));
        }
    }
}
