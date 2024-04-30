import java.util.*;
public class Guess {
    public static void main(String[] args) {
        //Making The user to guess the randomly generated no.

        Scanner sc=new Scanner(System.in);
        Random x=new Random();
        int v=x.nextInt(100)+1;
        int guess=0;
        int attempts=0;
        /*v=guess>0;*/
        do{
            attempts++;
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();
            if(guess==v)
            {
                System.out.println("Congratulations! You guessed the number in "+attempts+" attempts.");
            }
            else if(guess<v){
                System.out.println("Too low.Try again");
            }
            else {
                System.out.println("Too high.Try again.");
            }
        }while(guess!=v);
    }
}
