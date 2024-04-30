/*public class java1 {
    public static void main(String[] args) {
        int a=5;
        a++;//pre increment
        System.out.println(a++);//a++ post increment(the increment happens when used after another time)
        System.out.println(a);
    }
}
*/

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println("good");
                    break;
                case 2:
                    System.out.println("average");
                    break;
                default:
                    System.out.println("Error");
                    break;

            }
        }
    }
