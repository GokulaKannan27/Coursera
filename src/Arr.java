import java.util.*;
public class Arr {
    public static void main(String[] args) {
        //Finding even and odd position elements in 2d array
        Scanner n=new Scanner(System.in);
        int row=n.nextInt();
        int col=n.nextInt();
        int[][] a=new int[row][col];
        System.out.println("Enter the elements:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=n.nextInt();
            }
        }
        //Printing the elements
        for(int[] i:a)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Counting and Storing the elements based on position
        int[] even=new int[100];
        int[] odd=new int[100];
        int k=0,c=0,c1=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(j%2==0)
                {
                   even[k]=a[i][j];
                   c++;
                }
                else {
                    odd[k]=a[i][j];
                    c1++;
                }
                k++;
            }
        }
        if(c>c1)
        {
            System.out.println("Even Position elements are more");
        }
        else if(c>=c1)
        {
            System.out.println("Even and Odd are having equal count");
        }
        else{
            System.out.println("Odd Position elements are more");
        }
    }
}
