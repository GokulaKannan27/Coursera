import java.util.*;
public class matrix {
    public static void main(String[] args) {
      Scanner n=new Scanner(System.in);
      int row,col;
      row=n.nextInt();
      col=n.nextInt();
      int[][] a=new int[row][col];
      int[][] b=new int[col][row];
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
      for(int i=0;i<col;i++)
      {
          for(int j=0;j<row;j++)
          {
              b[i][j]=n.nextInt();
          }
      }
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<row;j++)
          {
              c[i][j]=0;
              for(int k=0;k<col;k++)
              {
                  c[i][j]+=a[i][k]*b[k][j];
              }
          }
      }
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<row;j++)
          {
              System.out.print(c[i][j]+" ");
          }
          System.out.println();
      }

    }
}
