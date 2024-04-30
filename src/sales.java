import java.util.*;

public class sales
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Sales Representatives:");
        int row = sc.nextInt();
        System.out.println("Enter the no. of Products:");
        int col = sc.nextInt();

        double[] avg = new double[10];
        double g=0;
        int c=0;
        int[][] n = new int[row][col];

        System.out.println("Enter the sales value of products:");
        for (int i = 0; i < row; i++) {
            int total = 0;
            for (int j = 0; j < col; j++) {
                n[i][j] = sc.nextInt();
                total += n[i][j];
            }
            avg[i] = (double)total / col;
        }
        for(int i=0;i<row;i++)
        {
            for(int j=i+1;j<row;j++) {
                if (avg[i] > g) {
                    g = avg[i];
                    c = i;
                }
            }
        }
        System.out.println("The sales representative "+ c +" with average sales greater than other is :"+g);
        System.out.println("-----Sales data-----");
        for (int i = 0; i < row; i++) {
            System.out.println("Sales of Representative " + (i + 1) + ":");
            for (int j = 0; j < col; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println("\tAverage sales:" + avg[i]);
            System.out.println();
        }

    }
}


