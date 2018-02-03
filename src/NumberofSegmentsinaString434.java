/**
 * @Author lpf
 * @Date 2/3/18 8:11 PM
 */
public class NumberofSegmentsinaString434 {
    public int countSegments(String s) {
        int result  = 0;
        int pre = 0;
        char SPACE = ' ';
        if (null == s || 0 == s.length()) {
            return 0;
        } else {
            int i = 0;
            while (i < s.length()) {
                if (0 == pre) {
                    while (i < s.length() && SPACE == s.charAt(i)) {
                        ++i;
                    }
                    if (i < s.length()) {
                        ++result;
                        pre = 1;
                    }
                } else {
                    while (i < s.length() && SPACE != s.charAt(i)) {
                        ++i;
                    }
                    if (i < s.length()) {
                        pre = 0;
                    }
                }
            }
            return result;
        }
    }
}
