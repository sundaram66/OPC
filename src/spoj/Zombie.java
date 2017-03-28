package spoj;

// Java program to count islands in boolean 2D matrix
import java.util.*;
import java.lang.*;
import java.io.*;

class Zombie
{


    static int zombieCluster(String[] zombies) {
        int t = zombies.length;
        int[][] M = new int[t][t];
        for(int i=0;i<t;i++) {
            String s = zombies[i];
            for(int j=0;j<t;j++) {
                M[i][j] = s.charAt(j)-'0';
            }
        }
        return count(M);
    }

    static boolean isSafe(int M[][], int row, int col,
                   boolean visited[][],int ROW,int COL)
    {

        return (row >= 0) && (row < ROW) &&
                (col >= 0) && (col < COL) &&
                (M[row][col]==1 && !visited[row][col]);
    }

    static void DFS(int M[][], int row, int col, boolean visited[][],int ROW,int COL)
    {
        int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};


        visited[row][col] = true;


        for (int k = 0; k < 8; ++k)
            if (isSafe(M, row + rowNbr[k], col + colNbr[k],visited,ROW,COL) )
                DFS(M, row + rowNbr[k], col + colNbr[k], visited,ROW,COL);
    }

    static int count(int M[][])
    {

        int ROW = M.length;
        int COL = ROW;
        boolean visited[][] = new boolean[ROW][COL];


        int count = 0;
        for (int i = 0; i < ROW; ++i)
            for (int j = 0; j < COL; ++j)
                if (M[i][j]==1 && !visited[i][j]) // If a cell with
                {                                 // value 1 is not
                    // visited yet, then new island found, Visit all
                    // cells in this island and increment island count
                    DFS(M, i, j, visited,ROW,COL);
                    ++count;
                }

        return count+1;
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] M = new int[t][t];
        for(int i=0;i<t;i++) {
            String s = in.next();
            for(int j=0;j<t;j++) {
                M[i][j] = s.charAt(j)-'0';
            }
        }

        Zombie I = new Zombie();
        System.out.println(I.count(M));
    }
}