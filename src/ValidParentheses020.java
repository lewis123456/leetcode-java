import java.util.Stack;

/**
 * @Author lpf
 * @Date 1/27/18 3:57 PM
 */
public class ValidParentheses020 {
    public boolean isValid(String s) {
        if (null == s || 0 == s.length()) {
            return true;
        }
        if (1 == s.length()%2) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i=1; i<s.length(); ++i) {
            char tmp = s.charAt(i);
            if (']' != tmp && ')' != tmp && '}' != tmp || 0 == stack.size()) {
                stack.push(tmp);
            } else {
                switch (tmp) {
                    case ']': {
                        if ('[' == stack.peek()) {
                            stack.pop();
                        }
                        break;
                    }
                    case ')': {
                        if ('(' == stack.peek()) {
                            stack.pop();
                        }
                        break;
                    }
                    case '}': {
                        if ('{' == stack.peek()) {
                            stack.pop();
                        }
                        break;
                    }
                }
            }
        }

        if (0 == stack.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidParentheses020 validParentheses020 = new ValidParentheses020();
        System.out.println(validParentheses020.isValid("()"));
    }
}
