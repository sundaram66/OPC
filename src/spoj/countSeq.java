package spoj;

/**
 * Created by seetharams on 21/3/17.
 */
public class countSeq {

    public static String countAndSay(int n) {

        if(n==1) return "1";
        if(n==2) return "11";

        String prev = "11";


        for(int i=3;i<=n;i++) {
            String temp = "";
            int cnt = 1;
            int j=1;
            for(;j<prev.length();j++) {
                // Check if consecutive matches
                if(prev.charAt(j) != prev.charAt(j-1)) {
                    // No Match. Update count and current character.
                    temp += cnt;
                    temp += prev.charAt(j-1);
                    cnt = 1;
                }
                else //Matches : Increment Count
                    cnt++;
            }

            temp += cnt;
            temp += prev.charAt(j-1);
            prev = temp;
            //System.out.println(prev);
        }
        return prev;
    }

    public static void main(String[] args) {

        countAndSay(5);

    }

}
