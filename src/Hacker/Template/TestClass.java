package HackerEarth.Template;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);*/

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String[] in = new String[N];
        for(int i=0;i<N;i++) {
            in[i] = s.next();
        }
        int distinct = 0;
        Set<String> origSet = new HashSet<>();
        for(int i=0;i<N;i++) {
            int old = origSet.size();
            origSet.add(in[i]);
            if(old != origSet.size())  distinct++;
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            origSet.clear();
            origSet.add(in[i]);
            for(int j=i+1;j<N;j++) {
                origSet.add(in[j]);
                if(origSet.size() == distinct)
                    result++;
            }
        }


        System.out.println(result);
    }
}

