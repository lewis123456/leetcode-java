import java.util.Scanner;
import java.util.Stack;

/**
 * @Author lpf
 * @Date 1/27/18 12:49 PM
 */
public class PalindromeNumber009 {
    public boolean isPalindrome(int x) {
        if (0 > x) {
            return false;
        }
        int y = 0;
        int origin = x;
        while (0 != x/10) {
            y = 10*y + x%10;
            x /= 10;
        }
        y = 10*y + x%10;
        if (origin == y) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PalindromeNumber009 palindromeNumber009 = new PalindromeNumber009();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(palindromeNumber009.isPalindrome(scanner.nextInt()));
        }
    }
}
