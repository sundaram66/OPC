package LC;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by seetharams on 28/3/17.
 */
public class Athletes {

    static class Rank {
        int score;
        int index;
    }

    public static void main(String[] args) {

        int[] a = {5, 4, 3, 2, 1};
        getRanks(a);
    }

    private static String[] getRanks(int[] a) {

        int n = a.length;
        String[] result = new String[n];

        Rank[] rank = new Rank[n];
        for(int i=0;i<n;i++) {
            rank[i] = new Rank();
        }
        for(int i=0;i<n;i++) {
            rank[i].score = a[i];
            rank[i].index = i;
        }

        Arrays.sort(rank, new Comparator<Rank>() {
            @Override
            public int compare(Rank o1, Rank o2) {
                return o2.score - o1.score;
            }
        });

        int cnt = 1;
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Gold Medal");
        map.put(2,"Silver Medal");
        map.put(3,"Bronze Medal");
        for(Rank r : rank) {
            result[r.index] = map.containsKey(cnt)?map.get(cnt): cnt + "";
            cnt++;
        }

        for(String s : result)
            System.out.println(s);

        return result;






    }


}
