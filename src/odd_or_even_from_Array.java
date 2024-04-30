import java.util.Scanner;

public class odd_or_even_from_Array {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner v=new Scanner(System.in);
        int n=v.nextInt();
        int [] a=new int[10];
        int e=0,o=0;
        for(int i=0;i<n;i++)
        {
           a[i]=v.nextInt();
        }
        for (int i=0;i<n;i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i] + " is even");
                e++;
            }
            else {
                System.out.println(a[i]+" is odd");
                o++;
            }
        }
        System.out.println("Even count : "+e+"\n"+"Odd count : "+o);

    }
}
