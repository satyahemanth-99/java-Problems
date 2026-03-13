import java.util.Scanner;

public class Array03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of memory Here: ");
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter " + (i + 1) + " Value Here: ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Thankyou for enter the values");

        System.out.print("your values are ");

        for(int j = 0; j< marks.length; j++){

            System.out.print(marks[j] + ",");
        }
    }
}
