package LC;

/**
 * Created by seetharams on 28/3/17.
 */


public class ThirdMax {

    public static void main(String[] args) {

        int[] a = {2,2,3,1};
        //int[] a = {5,4,3,2,1};
        System.out.println(getThirdMax(a));
    }

    private static int getThirdMax(int[] a) {

        int n = a.length;
        long M1 = Long.MIN_VALUE;
        long M2 = Long.MIN_VALUE;
        long M3 = Long.MIN_VALUE;

        for(int val : a) {
            if(M1 < val) {
                M3 = M2;
                M2= M1;
                M1 = val;
            }
            else if(M1 == val) continue;

            else if(M2 < val) {
                M3 = M2;
                M2 = val;
            }
            else if(M1 == val) continue;

            else if(M3 < val) {
                M3 = val;
            }
        }


        if(a.length < 1) return -1;
        if(a.length == 1) return (int) M1;
        if(a.length == 2) return (int) M1;

        return (int) (M3 == Long.MIN_VALUE ? M1:M3);
    }
}
