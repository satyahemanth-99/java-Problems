import java.util.Scanner;

public class Array011 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;

        int hum = 0;
        while( hum != num){
            num = (int)(Math.random() * 10);
            System.out.println("random number was " + num);
            System.out.println("Enter your number here: ");
            hum = sc.nextInt();
            if(hum > num){
                System.out.println("you guess too high");
            } else if (hum < num) {
                System.out.println("you guess  too low");
            }else {
                System.out.println("congrats you guess correctly");
                System.out.println("Do you want to play again? 'Yes'/ 'No' ");
                String ans = sc.next();
                if(ans.equals("Yes")){
                    hum = 0;
                }else {
                    System.out.println("thankyou for your visiting");
                }
            }
        }
        sc.close();
    }
}
