import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/28/18 11:23 AM
 */
public class LengthofLastWord058 {
    public int lengthOfLastWord(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }
        int q = s.length() - 1;
        int length = 0;
        while (q>=0 && ' ' == s.charAt(q)) {
            --q;
        }
        while (q>=0 && ' ' != s.charAt(q)) {
            ++length;
            --q;
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(new LengthofLastWord058().lengthOfLastWord(scanner.next()));
        }

    }
}
