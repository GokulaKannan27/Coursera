import java.util.Scanner;

public class matrix1 {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int row,col;
        row=n.nextInt();
        col=n.nextInt();
        int row1=n.nextInt();
        int col1=n.nextInt();
        int[][] a=new int[row][col];
        int[][] b=new int[row1][col1];
        int[][] c=new int[10][10];
        System.out.println("Enter Matrix1:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=n.nextInt();
            }
        }
        System.out.println("Enter Matrix2:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                b[i][j]=n.nextInt();
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                c[i][j]=0;
                for(int k=0;k<col1;k++)
                {
                    c[i][j]+=b[i][k]*a[k][j];
                }
            }
        }
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
}
