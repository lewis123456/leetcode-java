/**
 * @Author lpf
 * @Date 2/3/18 3:40 PM
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        if (null == s || 0 == s.length()) {
            return 0;
        }

        int[] nums = new int[52];
        for (int i = 0; i < 52; ++i) {
            nums[i] = 0;
        }

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= 'a') {
                nums[26 + s.charAt(i) - 'a'] += 1;
            } else {
                nums[s.charAt(i) - 'A'] += 1;
            }
        }

        int result = 0;
        for (int i = 0; i < 52; ++i) {
            result += nums[i]/2*2;
        }
        if (result == s.length()) {
            return result;
        } else {
            return result + 1;
        }
    }
}
