package CC;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.InputStream;

public class LCS {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LcsInputReader in = new LcsInputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskLcs solver = new TaskLcs();
        solver.solve(1, in, out);
        out.close();
    }
}

class TaskLcs {
    public void solve(int testNumber, LcsInputReader in, PrintWriter out) {
        // Read inputs and write the main function.
        // nextInt, nextLong,next,nextLine
        String s1 = in.next();
        String s2 = in.next();
        out.println(getLcsLength(s1,s2));

    }

    private int getLcsLength(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[][] dp = new int[l1][l2];

        for(int i=0;i<l1;i++) {
            dp[i][0] = s1.charAt(i)==s2.charAt(0)?1:0;
        }

        for(int j=0;j<l2;j++) {
            dp[0][j] = s1.charAt(0) == s2.charAt(j) ? 1 : 0;
        }

        for(int i=1;i<l1;i++) {
            for(int j=1;j<l2;j++) {
                dp[i][j] = Math.max(Math.max(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                if(s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] += 1;
                }
            }
        }

        return dp[l1-1][l2-1];
    }
}


class LcsInputReader {
    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public LcsInputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public Long nextLong() {
        return Long.parseLong(next());
    }
}