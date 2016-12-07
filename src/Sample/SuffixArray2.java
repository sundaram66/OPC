package Sample;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by seetharams on 24/10/16.
 */
public class SuffixArray2 {

    public static void main(String[] args) {

        String in = "abracadabra0AbRa4Cad14abra";
        int n = in.length();
        Suffix arr[] = new Suffix[n];

        for(int i=0;i<n;i++) {
            arr[i] = new Suffix();
        }

        for(int i=0;i<n;i++) {
            arr[i].s = in.substring(i);
            arr[i].index = i;
            arr[i].rank[0] = in.charAt(i);
            arr[i].rank[1] = i+1 < n ? in.charAt(i+1):-1;
        }

        Arrays.sort(arr, new Comparator<Suffix>() {
            @Override
            public int compare(Suffix o1, Suffix o2) {
                return o1.rank[0]==o2.rank[0]? o1.rank[1] - o2.rank[1] :  o1.rank[0] - o2.rank[0];
            }
        });

        int[] origIndex = new int[n];
        for(int k=4; k < 2*n; k = k*2) {
            int rank = 0;
            int prevRank = arr[0].rank[0];
            origIndex[arr[0].index] = 0;
            arr[0].rank[0] = rank;

            // Assign Rank0 to all
            for(int i=1;i<n;i++) {
                if(arr[i].rank[0] == prevRank && arr[i].rank[1] == arr[i-1].rank[1]) {
                    prevRank = arr[i].rank[0];
                    arr[i].rank[0] = rank;
                }
                else {
                    prevRank = arr[i].rank[0];
                    arr[i].rank[0] = ++rank;
                }
                origIndex[arr[i].index] = i;
            }

            // Assign Rank1 to all
            for(int i=0; i<n;i++) {
                int nextIndex = arr[i].index + k/2;
                if(nextIndex < n) {
                    arr[i].rank[1] = arr[origIndex[nextIndex]].rank[0];
                }
                else arr[i].rank[1] = -1;
            }

            Arrays.sort(arr, new Comparator<Suffix>() {
                @Override
                public int compare(Suffix o1, Suffix o2) {
                    return o1.rank[0]==o2.rank[0]? o1.rank[1] - o2.rank[1] :  o1.rank[0] - o2.rank[0];
                }
            });

        }

        for (int i=0;i<n;i++) {
            System.out.println(arr[i].index);
        }


    }
}
