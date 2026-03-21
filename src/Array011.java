import java.util.Scanner;

public class Array011 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int)(Math.random() * 10);
        System.out.println("random number was " + num);

        int hum = 0;
        while( hum != num){
            System.out.println("Enter your number here: ");
            hum = sc.nextInt();
            if(hum > num){
                System.out.println("you guess too high");
            } else if (hum < num) {
                System.out.println("you guess  too low");
            }else {
                System.out.println("congrats you guess correctly");
                
            }
        }
    }
}
