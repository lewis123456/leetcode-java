import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/28/18 12:06 PM
 */
public class SqrtX069 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int mid = 1;
        int tmp;
        while (left < right) {
            tmp = mid * mid;
            if (x == tmp) {
                return mid;
            }else if (x > tmp) {
                left = mid;
            }else {
                right = mid;
            }
            if (mid == (left+right)/2) {
                break;
            }
            mid = (left+right)/2;
            System.out.println("mid:"+mid);
        }
        if (mid*mid > x) {
            return mid - 1;
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(new SqrtX069().mySqrt(scanner.nextInt()));
        }
    }
}
