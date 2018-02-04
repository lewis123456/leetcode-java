/**
 * @Author lpf
 * @Date 2/5/18 12:08 AM
 */
public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        if (null == g || null == s || 0 == g.length || 0 == s.length) {
            return 0;
        }
        quickSort(g, 0, g.length-1);
        quickSort(s, 0, s.length-1);
        int result = 0;
        for (int i=0,j=0; i<g.length && j<s.length; ) {
            if (g[i] <= s[j]) {
                ++result;
                ++i;
                ++j;
            } else {
                ++j;
            }
        }
        return result;
    }

    private void quickSort(int[] x, int left, int right) {
        if (null == x || 0 == x.length || 1 == x.length || left >= right || left < 0) {
            return;
        } else {
            int now = x[left];
            int i = left;
            int j = right;
            while (i < j) {
                while (x[j] >= now && i < j) {
                    --j;
                }
                if (i < j) {
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                    ++i;
                }
                while (x[i] < now && i < j) {
                    ++i;
                }
                if (i < j) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    --j;
                }
            }
            if (i > left) {
                quickSort(x, left, i-1);
            }
            if (j < right) {
                quickSort(x, i+1, right);
            }

        }
    }

    public static void main(String[] args) {
        int[] s = new int[4];
        int[] g = new int[4];
        s[0] = 10;
        s[1] = 9;
        s[2] = 8;
        s[3] = 7;
        g[0] = 5;
        g[1] = 6;
        g[2] = 7;
        g[3] = 8;
        System.out.println(new AssignCookies455().findContentChildren(s, g));
    }
}
