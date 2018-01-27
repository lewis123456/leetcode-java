/**
 * @Author lpf
 * @Date 1/27/18 2:23 PM
 */
public class RomanToInteger013 {
    private enum RomanDigit {
        I('I', 1),
        V('V', 5),
        X('X', 10),
        L('L', 50),
        C('C', 100),
        D('D', 500),
        M('M', 1000);

        private char digit;
        private int value;

        RomanDigit(char digit, int value) {
            this.digit = digit;
            this.value = value;
        }

        public char getDigit() {
            return digit;
        }

        public void setDigit(char digit) {
            this.digit = digit;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public int romanToInt(String s) {

        return 0;
    }

    public static void main(String[] args) {

    }
}
