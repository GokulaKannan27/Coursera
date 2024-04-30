import java.util.Scanner;

public class Previous {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter Date between 1 to 31");
        int date=n.nextInt();
        System.out.println("Enter Month from 1 to 12");
        int Month=n.nextInt();
        System.out.println("Enter year from 1900 to 2025");
        int year=n.nextInt();
        switch (Month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(date==1)
                {
                    Month=Month-1;
                    date=31;
                }
        }
    }
}
