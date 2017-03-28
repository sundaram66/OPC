/**
 * Created by seetharams on 5/10/16.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;




public class MobConversion {

    static class Call {

        int gain;
        int loss;
    }

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        Call[] call = new Call[N];
        for (int i = 0; i < N; i++) {
            call[i] = new Call();
        }



        for (int i = 0; i < N; i++) {
            String[] entry = br.readLine().split(" ");
            call[i].loss = Integer.parseInt(entry[0]);
            call[i].gain = Integer.parseInt(entry[1]);
        }

        Arrays.sort(call, new Comparator<Call>() {
            @Override
            public int compare(Call o1, Call o2) {
                return o1.loss-o2.loss;
            }
        });
        System.out.println(getMinimumBalance(call));
    }

    public static int getMinimumBalance(Call[] call) {
        int sum = 0;
        int total = 0;
        int current = 0;
        for(int i=0;i<call.length;i++)
        {
            int diff = call[i].gain-call[i].loss;
            sum += diff;
            total += diff;
            if(sum<0)
            {
                sum=0;
                current=i;
            }
        }
        return total>=0?call[current+1].gain:-1;
    }
}

