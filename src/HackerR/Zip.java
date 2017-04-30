package HackerR;

/**
 * Created by seetharams on 2/4/17.
 */
public class Zip {


    public static void main(String[] args) {

        System.out.println(solution(1234,0));

    }

    public static int solution(int a, int b) {
        if ((a < 0 || a > 100000000) || ((b < 0 || b > 100000000))) {
            return -1;
        }
        char[] arrayFirstNumber = String.valueOf(a).toCharArray();
        char[] arraySecondNumber = String.valueOf(b).toCharArray();
        String aux = "";

        for (int i = 0; i < arrayFirstNumber.length || i < arraySecondNumber.length; i++) {
            if (i < arrayFirstNumber.length) {
                aux += arrayFirstNumber[i];
            }
            if (i < arraySecondNumber.length) {
                aux += arraySecondNumber[i];
            }
        }
        int result = Integer.parseInt(aux);
        if (result > 100000000) {
            return -1;
        }
        return result;

    }
}
