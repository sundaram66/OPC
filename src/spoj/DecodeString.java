package spoj;

import java.util.Stack;

/**
 * Created by seetharams on 22/3/17.
 */
public class DecodeString {

    public static void main(String[] args) {

        //String s1 = "3[a]2[bc]";
        String s1 = "2[abc]3[cd]ef";
//        String s1 = "3[a]2[bc]";
//        String s1 = "3[a]2[bc]";
        System.out.println(decode(s1));
    }

    private static String decode(String s) {

        StringBuilder result = new StringBuilder();
        int n = s.length();
        StringBuilder ins = new StringBuilder();
        Stack<String> st = new Stack<>();
        int rep = 0;

        for(int i=0;i<n;) {
            // Digit repetition count
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                rep = c - '0';
            }
            i++;

            c = s.charAt(i);
            if(c=='[') i++;

            while(i<n && Character.isAlphabetic(s.charAt(i))) {
                ins = new StringBuilder();
                ins.append(s.charAt(i));
                i++;
            }

            if(s.charAt(i) == ']') {
                st.push(ins.toString());
                i++;
            }
            else
                continue;
        }
        return result.toString();
    }
}
