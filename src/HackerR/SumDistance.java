package HackerR;

/**
 * Created by seetharams on 2/4/17.
 */
public class SumDistance {

    public static void main(String[] args) {
        int[] a = {1,3,-3};
        System.out.println(solution(a));

    }

    public static int solution(int []a) {

        int sum = Integer.MIN_VALUE;
        int n = a.length;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {

                sum = Math.max((a[i]+a[j] + j- i),sum);

            }
        }

        return sum;

    }

}
