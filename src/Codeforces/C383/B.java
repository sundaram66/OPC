package Codeforces.C383;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.io.InputStream;

public class B {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        BInputReader in = new BInputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }
}

class TaskB {
    public void solve(int testNumber, BInputReader in, PrintWriter out) {
        // Read inputs and write the main function.
        // nextInt, nextLong,next,nextLine
        int n = in.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            sum += a[i];
        }

        if(sum != (n*(n+1))/2) {
            out.println(-1);
            return;
        }
        int[] dp = new int[n];
        for(int i=0;i<n;i++) {
            int k = a[i];
            int steps = 0;
            while(k-1 != i) {
                steps++;
                k = a[k-1];
            }
            dp[i] = steps;
        }

        int c = dp[0];
        for (int res : dp) {
            c = Math.max(c,res);
        }
        out.println(c);

    }
}


class BInputReader {
    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public BInputReader(InputStream stream) {
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