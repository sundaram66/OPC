package LC;

import java.util.Arrays;

/**
 * Created by seetharams on 23/3/17.
 */
public class SingleRep {

    public static void main(String[] args) {

        int[] a = {1,1,2,3,3,4,4,8,8};
        System.out.println(getSingleRep(a));
    }

    private static int getSingleRep(int[] a) {
        if(a.length < 1) {
            return 0;
        }
        final int[] result = {0};

        Arrays.stream(a).forEach(value -> { result[0] ^= value;});

        return result[0];


    }
}
