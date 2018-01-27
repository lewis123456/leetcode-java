import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/27/18 3:29 PM
 */
public class LongestCommonPrefix014 {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer commonsPrefix = new StringBuffer("");
        if (0 == strs.length) {
            return commonsPrefix.toString();
        }
        if (1 ==  strs.length) {
            return strs[0];
        }

        for (int i=0; ; ++i) {
            if (i >= strs[0].length()) {
                return commonsPrefix.toString();
            }
            char common = strs[0].charAt(i);

            for (int j=1; j<strs.length; ++j) {
                if (i >= strs[j].length()) {
                    return commonsPrefix.toString();
                }
                if (common != strs[j].charAt(i)) {
                    return commonsPrefix.toString();
                }
            }

            commonsPrefix.append(common);
        }
    }

    public static void main(String[] args) {
        LongestCommonPrefix014 longestCommonPrefix014 = new LongestCommonPrefix014();
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[4];
        for (int i=0; i<4; ++i) {
            strs[i] = scanner.nextLine();
        }
        System.out.println(longestCommonPrefix014.longestCommonPrefix(strs));
    }
}
