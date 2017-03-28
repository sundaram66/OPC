package LC;

import java.util.*;

/**
 * Created by seetharams on 21/2/17.
 */
public class Election {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        String[] values = new String[t];
        for(int i=0;i<t;i++) {
            values[i] = in.next();
        }

        System.out.println(electionWinner(values));

    }

    static String electionWinner(String[] votes) {
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<votes.length;i++) {

            if(map.containsKey(votes[i])) {
                int cnt = map.get(votes[i]);
                cnt++;
                map.put(votes[i],cnt);
            }
            else
                map.put(votes[i],1);
        }
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

        Map.Entry<String, Integer> firstEntry = list.get(0);
        int maxVotes = firstEntry.getValue();
        String winner = firstEntry.getKey();

        list.remove(0);

        for(Map.Entry<String, Integer> entry:list){
            if(maxVotes == entry.getValue()) {
                if(winner.compareToIgnoreCase(entry.getKey()) < 0) {
                    winner = entry.getKey();
                }
            }
            else
                return winner;
        }
        return winner;

    }
}
