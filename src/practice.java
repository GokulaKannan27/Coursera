import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int sc=n.nextInt();
        int[] a=new int[sc];
        int row=3;

        for(int i=0;i<sc;i++)
        {
            a[i]=n.nextInt();
        }
        for(int i:a)
            System.out.println(i);
        int col=a.length/row;
        int[][] b=new int[row][col];
        int k=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                b[i][j]=a[k];
                k++;
            }
        }
        for(int[] i:b)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Shift Operations
       /* int a=n.nextInt();
        int b=n.nextInt();
        for(int i=1;i<=10;i++)
        {
            a=i<<2;
            System.out.println(a);
            a=0;
        }*/
       /* int r=a^b;
        System.out.println(r);
        a= ~a;
        System.out.println(a);
        a=a<<2;
        System.out.println(a);
        b= b>>2;
        System.out.println(b);
        b=b>>>2;
        System.out.println(b);*/

    }
}
