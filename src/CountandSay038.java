import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/28/18 9:43 AM
 */
public class CountandSay038 {
    public String countAndSay(int n) {
        if (1 == n) {
            return "1";
        }
        if (2 == n) {
            return "11";
        }

        StringBuffer response = new StringBuffer();
        String pre = countAndSay(n-1);
        for (int i=0; i<pre.length(); ++i) {
            int nums = 1;
            char tmp = pre.charAt(i);
            while (i < pre.length()-1 && tmp == pre.charAt(i+1)) {
                ++nums;
                ++i;
            }
            response.append(nums);
            response.append(tmp);
        }
        return response.toString();
    }

    public static void main(String[] args) {
        CountandSay038 countandSay038 = new CountandSay038();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(countandSay038.countAndSay(scanner.nextInt()));
        }
    }
}
