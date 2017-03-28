package HackerR;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seetharams on 5/12/16.
 */
public class LargestElements {

    public static void main(String[] args) {


        int[] array1 = {3, 8, 5, 2, 7, 9};
        int[] array2 = {5, 8, 22, 7, 2, 15, 3};
        int[] array3 = {35, 12, 19, 35, 45};
        int[] array4 = {55, 99, 12};
        int[] array5 = {33, 11, 77, 44, 55};
        int[] array6 = {99, 88, 222, 66, 1000};

        System.out.println(LargestInCommon(array1, array2));
        System.out.println(LargestInCommon(array3, array4));
        System.out.println(LargestInCommon(array5, array6));

    }

    private static int LargestInCommon(int[] a, int[] b) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++) {
            map.put(a[i],0);
        }
        int greatest = -1;
        if(map.containsKey(b[0])) greatest = b[0];
        for(int i=1;i<b.length;i++) {
            if(map.containsKey(b[i])){
               if(greatest < b[i])
                    greatest = b[i];
            }
        }
        return greatest;
    }
}
