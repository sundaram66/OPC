package LC;

import java.util.Scanner;
import java.util.Stack;

public class Valid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            String s = in.next();
            if(isValid(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    static String[] braces(String[] values) {

        String[] result = new String[values.length];

        for(int i=0;i<values.length;i++) {

            if(isValid(values[i]))
                result[i] = "YES";
            else
                result[i] = "NO";

        }
        return result;
    }

    public static boolean isValid(String exp) {

        if(exp == null) return true;

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<exp.length();i++) {
            char c = exp.charAt(i);
            if( c == '{' || c == '[' || c == '(') {
                st.push(c);
            }
            else {
                if(st.isEmpty()) return false;
                char top = st.pop(); //Exception if given input }}} -> not valid
                if(c == '}') {
                    if(top != '{') return false;

                }
                else if(c == ')') {
                    if(top != '(') return false;
                }
                else if(c == ']') {
                    if(top != '[') return false;
                }
            }
        }
        if(!st.isEmpty()) return false;
        return true;
    }
}