import java.util.Arrays;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
       /* System.out.println("Enter the Array Limit : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int t=0,j;
        int [] a=new int[10];
        for (int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        //Ascending order sort
        for (int i=1;i<n;i++)
        {
            t=a[i];
            for ( j=i-1;j>=0&&a[j]>t;j--)
            {
                    a[j+1]=a[j];
            }
            a[j+1]=t;
        }
        System.out.println("Sorted array is");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }*/

        //Descending order
       /* System.out.println("Enter the Limit : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int t;
        int [] a=new int[10];
        System.out.println("Enter the Array elements : ");
        for (int i=0;i<n;i++)
        {
            a[i]=v.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+"\t");
        }*/

        //Program to insert element in specific index of array

        int [] a={10,20,30,40,50,60};
        int index=2;
        int value=55;
        System.out.println(Arrays.toString(a));

        for(int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println(Arrays.toString(a));
    }
}
