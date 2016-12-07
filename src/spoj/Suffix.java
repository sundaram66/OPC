package spoj;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.io.InputStream;

class Solution{
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        CustomInputReader in = new CustomInputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskFarida solver = new TaskFarida();
        solver.solve(1, in, out);
        out.close();
    }
}

class Suffix {
    int index;
    int[] rank = new int[2];
    String s;
}

class TaskFarida {
    public void solve(int testNumber, CustomInputReader in, PrintWriter out) {
        //Read inputs and write the main function.
        String input = in.next();
        Suffix[] output = getSuffixArray(input);
        for (Suffix s : output)
            System.out.println(s.index);

    }


    public Suffix[] getSuffixArray(String in) {
        int n = in.length();
        Suffix arr[] = new Suffix[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Suffix();
        }

        for (int i = 0; i < n; i++) {
            arr[i].s = in.substring(i);
            arr[i].index = i;
            arr[i].rank[0] = in.charAt(i);
            arr[i].rank[1] = i + 1 < n ? in.charAt(i + 1) : -1;
        }

        Arrays.sort(arr, new Comparator<Suffix>() {
            @Override
            public int compare(Suffix o1, Suffix o2) {
                return o1.rank[0] == o2.rank[0] ? o1.rank[1] - o2.rank[1] : o1.rank[0] - o2.rank[0];
            }
        });

        int[] origIndex = new int[n];
        for (int k = 4; k < 2 * n; k = k * 2) {
            int rank = 0;
            int prevRank = arr[0].rank[0];
            origIndex[arr[0].index] = 0;
            arr[0].rank[0] = rank;

            // Assign Rank0 to all
            for (int i = 1; i < n; i++) {
                if (arr[i].rank[0] == prevRank && arr[i].rank[1] == arr[i - 1].rank[1]) {
                    prevRank = arr[i].rank[0];
                    arr[i].rank[0] = rank;
                } else {
                    prevRank = arr[i].rank[0];
                    arr[i].rank[0] = ++rank;
                }
                origIndex[arr[i].index] = i;
            }

            // Assign Rank1 to all
            for (int i = 0; i < n; i++) {
                int nextIndex = arr[i].index + k / 2;
                if (nextIndex < n) {
                    arr[i].rank[1] = arr[origIndex[nextIndex]].rank[0];
                } else arr[i].rank[1] = -1;
            }

            Arrays.sort(arr, new Comparator<Suffix>() {
                @Override
                public int compare(Suffix o1, Suffix o2) {
                    return o1.rank[0] == o2.rank[0] ? o1.rank[1] - o2.rank[1] : o1.rank[0] - o2.rank[0];
                }
            });

        }
        return arr;
    }
}


    class CustomInputReader {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        public CustomInputReader(InputStream stream) {
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
