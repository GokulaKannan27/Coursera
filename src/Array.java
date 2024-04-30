import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       /* int a[];
        a=new int[10];
        Scanner v=new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            a[i]=v.nextInt();
        }
        for (int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }*/

        //Matrix Addition
        int a[][],b[][],c[][];
        a=new int[10][10];
        b=new int[10][10];
        c=new int[10][10];
        Scanner v=new Scanner(System.in);
        System.out.println("Enter the First array : ");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
             a[i][j]=v.nextInt();
            }
        }
        System.out.println("Enter the Second array : ");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                b[i][j]=v.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The First array :");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The Second array :");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The Addition of the Two matrix is:");
        for(int i=0;i<2;i++)
        {
            for (int j=0;j<2;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
