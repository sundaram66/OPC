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

public class C {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        CInputReader in = new CInputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }
}

class TaskC {
    public void solve(int testNumber, CInputReader in, PrintWriter out) {
        // Read inputs and write the main function.
        // nextInt, nextLong,next,nextLine
        int n = in.nextInt();
        int x = in.nextInt();
        int[] a = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            int cnt = 1;
            if(map.containsKey(a[i])) {
                cnt = map.get(a[i]) + 1;
            }
            map.put(a[i],cnt);
        }

        if(n == 1) {
            System.out.println(0);
            return;
        }

        long res = 0;
        for(int i=0;i<n;i++) {
            int ex = x ^ a[i];
            if(map.containsKey(ex)) {
                int rep = map.get(ex) ;
                res += rep;
                if(ex == a[i]) res--;
            }
        }
        out.println((res)/2);
    }
}


class CInputReader {
    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public CInputReader(InputStream stream) {
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