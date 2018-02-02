import java.util.ArrayList;
import java.util.List;

/**
 * @Author lpf
 * @Date 2/2/18 11:21 PM
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i=1; i<=n; ++i) {
            if (0 == i%15) {
                result.add("FizzBuzz");
            } else if (0 == i%5) {
                result.add("Buzz");
            } else if (0 == i%3) {
                result.add("Fizz");
            } else {
                result.add(new Integer(i).toString());
            }
        }
        return result;
    }
}
