package HackerR;

/**
 * Created by seetharams on 6/3/17.
 */
public class MaxValue {

    public static void main(String[] args) {

        int[] a = {6,1,2,7};
        System.out.println(getMaxStolen(a));
    }

    public static int getMaxStolen(int[] A) {
        int currentMax = 0;
        if (A == null || A.length == 0) {
            return currentMax;
        }
        int size = A.length;
        if (size == 1) {
            return A[0];
        }
        if (size == 2) {
            return Math.max(A[0], A[1]);
        }

        int prevMax = A[0];
        currentMax = Math.max(A[0], A[1]);
        int adjMax = currentMax;
        for (int i = 2; i < A.length; i++) {
            currentMax = Math.max(adjMax, prevMax + A[i]);
            prevMax = adjMax;
            adjMax = currentMax;
        }
        return currentMax;
    }

}
