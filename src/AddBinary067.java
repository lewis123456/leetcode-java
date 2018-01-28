import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/28/18 11:38 AM
 */
public class AddBinary067 {
    public String addBinary(String a, String b) {
        int diff = a.length() - b.length();
        String temp = "";
        for (int i=0; i<Math.abs(diff); ++i) {
            temp += "0";
        }
        if (diff < 0) {
            a = temp + a;
        }
        if (diff > 0) {
            b = temp + b;
        }
        int add = 0;
        String response = "";
        for (int i=a.length()-1; i>=0; --i) {
            if (a.charAt(i) == b.charAt(i)) {
                if (1 == add) {
                    response = "1" + response;
                } else {
                    response = "0" + response;
                }
                add = 0;
                if ('1' == a.charAt(i)) {
                    add = 1;
                }
            } else {
                if (1 == add) {
                    response = "0" + response;
                } else {
                    response = "1" + response;
                }
            }
        }
        if (1 == add) {
            response = "1" + response;
        }
        return response;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(new AddBinary067().addBinary(scanner.next(), scanner.next()));
        }
    }
}
