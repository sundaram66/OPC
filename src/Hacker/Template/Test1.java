package HackerEarth.Template;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Test1 {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] in = new int[N];
        for(int i=0;i<N;i++) {
            in[i] = Integer.parseInt(s.next());
        }

        int Q = s.nextInt();
        while(Q-- > 0) {

            int type = s.nextInt();
            int x = s.nextInt();
            int cnt = 0;

            for (int i = 0; i < N; i++) {
                if (in[i] > x)
                    cnt++;
                if(in[i] == x && type == 0) cnt++;
                }

            System.out.println(cnt);
        }




    }
}

