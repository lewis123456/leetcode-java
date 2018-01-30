import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/29/18 11:47 PM
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        if (27 > n) {
            int tmp = n % 26;
            if (0 == )
        }
        while (0 != n) {
            int tmp = n % 26 + 1 + 64;
            n /= 26;
            result.append((char)tmp);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(new ExcelSheetColumnTitle168().convertToTitle(scanner.nextInt()));
        }
    }
}
