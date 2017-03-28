package Codeforces.C383.C382;

import jdk.nashorn.internal.runtime.regexp.joni.constants.TargetInfo;

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
        int jumps = in.nextInt();

        String s = in.next();
        boolean right = true;
        int len = s.length();
        int i = 0;
        int gIndex = 0, tIndex = 0;
        while (i < len) {
            if (s.charAt(i) == 'G') {
                gIndex = i;
            }
            if (s.charAt(i) == 'T')
                tIndex = i;
            i++;
        }
        boolean done = false;
        if (gIndex > tIndex) right = false;
        if (right) {
            for (i = gIndex + jumps; i < n; ) {
                if (s.charAt(i) == 'T') {
                    done = true;
                    break;
                }

                else if (s.charAt(i) == '#') {
                    done = false;
                    break;
                }
                i += jumps;
            }
        } else {
            for (i = gIndex - jumps; i >= 0; ) {
                if (s.charAt(i) == 'T') {
                    done = true;
                    break;
                }
                else if (s.charAt(i) == '#') {
                    done = false;
                    break;
                }

                i -= jumps;
            }
        }
        if(done) out.println("YES");
        else out.println("NO");
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