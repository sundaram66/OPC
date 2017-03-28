package LC;

/**
 * Created by seetharams on 28/3/17.
 */
public class ArrayLoop {

    public static void main(String[] args) {

        //int[] a = {-1,2};
        int[] a = {2, -1, 1, -2, -2};
        System.out.println(isCircular(a));

    }

    private static boolean isCircular(int[] a) {

        int n = a.length;
        int nextIndex = 0,i=0;
       while(i < n) {

            if(i>=0 && i<n && a[i] == 0)
                return true;

            nextIndex = (i + a[i])% n;
            if(nextIndex < 0)
                return false;

            a[i] = 0;
            i = nextIndex;
        }

        return false;
    }

}
