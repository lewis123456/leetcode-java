/**
 * @Author lpf
 * @Date 2/3/18 7:47 PM
 */
public class AddStrings415 {
    public String addStrings(String num1, String num2) {

        int length1 = num1.length(), length2 = num2.length();
        StringBuilder result = new StringBuilder();
        int add = 0;
        int i, j;
        for (i=length1-1, j=length2-1; i>=0 && j>=0; --i, --j) {
            int temp = num1.charAt(i) - '0' + num2.charAt(j) - '0' + add;
            result.insert(0, temp%10);
            add = temp/10;
        }
        while (i >= 0) {
            int temp = num1.charAt(i) - '0' + add;
            result.insert(0, temp%10);
            add = temp/10;
            --i;
        }
        while (j >= 0) {
            int temp = num2.charAt(j) - '0' + add;
            result.insert(0, temp%10);
            add = temp/10;
            --j;
        }
        if (1 == add) {
            result.insert(0, 1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new AddStrings415().addStrings("879578", "497555"));
    }
}
