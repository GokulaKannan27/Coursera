import java.util.Objects;
import java.util.Scanner;

public class Group_Switch {
    public static void main(String[] args) {
        char c;

        System.out.println("Enter the character : ");
        Scanner n=new Scanner(System.in);
        c=n.next().charAt(0);
        switch(c)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowles");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
