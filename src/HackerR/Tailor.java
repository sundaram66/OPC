package HackerR;

import java.util.Scanner;

public class Tailor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] dp = new int[100000];

        int cnt;
        int result = 0;
        for(int i=0;i<n;i++) {
            cnt = 0;
            cnt += a[i]/p;
            if(a[i] % p != 0) {
                cnt += 1;
            }
            while(dp[cnt] == 1) {
                cnt++;
            }
            dp[cnt] = 1;
            result += cnt;
        }
        System.out.println(result);
    }
}
