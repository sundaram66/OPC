package Lens;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] input = br.readLine().split(" ");
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        int[] result = getNearest(a,N);
        for(int k : result) {
            if (k != -1) k++;
            System.out.print(k + " ");
        }

    }


    public static int[] getNearest(int[] a,int n) {

        int[] result = new int[n];
        boolean[] prime = new boolean[1000001];
        Arrays.fill(prime,true);
        fillPrime(prime);

        int lastPrimeIndex = -1;
        for(int i= 0;i<n;i++) {
            if(prime[a[i]]) {
                lastPrimeIndex = i;
                result[i] = i;
            }
            else
                result[i] = lastPrimeIndex;
        }

        lastPrimeIndex = -1;
        for(int i=n-1;i>=0;i--) {
            if(prime[a[i]]) {
                lastPrimeIndex = i;
                result[i] = i;
            }
            else {
                if(result[i] == -1 || Math.abs(lastPrimeIndex-i) < Math.abs(i-result[i]))
                    result[i] = lastPrimeIndex;
                }
            }

           return result;
        }

    private static void fillPrime(boolean[] prime) {

        prime[0]=prime[1]=false;

        for(int p = 2; p*p <=1000000; p++)
        {

            if(prime[p])
            {
                for(int i = p*p; i <= 1000000; i += p)
                    prime[i] = false;
            }
        }

    }

}
