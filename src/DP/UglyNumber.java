package DP;

/**
 * Created by seetharams on 13/4/17.
 */
public class UglyNumber {

    public static void main(String[] args) {

        int[] a = new int[150];

        getUglyNos(a);

        for(int k : a)
            System.out.print(k + " ");

    }

    public static void getUglyNos(int[] a) {

        a[0] = 1;
        int n2 = 0, n3 = 0, n5 = 0;

        int i=1;

        while(i < a.length) {

            int nm2 = a[n2] * 2;
            int nm3 = a[n3] * 3;
            int nm5 = a[n5] * 5;
            int minVal = Math.min(nm2, Math.min(nm3, nm5));

            if(nm2 == minVal) {
                n2 = n2 + 1;
            }

            if(nm3 == minVal) {
                n3 = n3 + 1;
            }

            if(nm5 == minVal) {
                n5 = n5 + 1;
            }
            
            a[i] = minVal;
            i++;
        }


    }

}
