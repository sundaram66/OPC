package spoj;

/**
 * Created by seetharams on 22/3/17.
 */
public class Hindex {

    public static void main(String[] args) {

        int[] a = {3,0,1,5,6};
        //int[] a = {0};
        //int[] a = {1,1};
        System.out.println(getHindex(a));

    }


    public static int getHindex(int[] a) {

        int max = Integer.MIN_VALUE;

        if(a.length == 0) return 0;

        for (int i : a) {
            max = Math.max(i,max);
        }
        int[] cnt = new int[max+1];

        for(int i=0;i<a.length;i++)
            cnt[a[i]]++;

        for(int i=max-1;i>=0;i--)
            cnt[i] += cnt[i+1];

        //System.out.println(cnt);

        for(int i=max;i>=0;i--) {
            if(i <= cnt[i])
                return i;
        }

        return 0;
    }
}
