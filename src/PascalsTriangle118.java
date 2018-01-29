import java.util.ArrayList;
import java.util.List;

/**
 * @Author lpf
 * @Date 1/29/18 9:57 PM
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows <= 0) {
            return result;
        }
        if (1 == numRows) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            result.add(tmp);
            return result;
        }else {
            List<Integer> tmp1 = new ArrayList<>();
            tmp1.add(1);
            result.add(tmp1);
            List<Integer> tmp2 = new ArrayList<>();
            tmp2.add(1);
            tmp2.add(1);
            result.add(tmp2);
            if (2 == numRows) {
                return result;
            } else {
                int index = 3;
                while (index <= numRows) {
                    List<Integer> pre = result.get(index-2);
                    List<Integer> now = new ArrayList<>();
                    now.add(pre.get(0));
                    for (int i=0; i<pre.size()-1; ++i) {
                        now.add(pre.get(i) + pre.get(i+1));
                    }
                    now.add(pre.get(pre.size()-1));
                    result.add(now);
                    ++index;
                }
                return result;
            }
        }

    }
}
