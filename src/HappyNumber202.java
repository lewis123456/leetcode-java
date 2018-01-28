import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author lpf
 * @Date 1/28/18 10:42 PM
 */
public class HappyNumber202 {
    //todo not a good algorithm, waste space and time
    public boolean isHappy(int n) {
        if (1 == n) {
            return true;
        }
        int tmp = 0;
        int origin = n;
        Set<Integer> set = new HashSet<>();
        do {
            while(0 != n) {
                tmp += (n%10)*(n%10);
                n /= 10;
            }
            n = tmp;
            System.out.println(n);
            if (1 == n) {
                return true;
            }
            if (origin == n) {
                return false;
            }
            if (set.contains(n)) {
                return false;
            } else {
                set.add(n);
            }
            tmp = 0;

        } while (true);
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber202().isHappy(2));
    }
}
