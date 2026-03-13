import java.util.Scanner;
public class ClassesnObjects010 {
    static void main(String[] args) {
        int n = 3;
        Scanner sc = new Scanner(System.in);
        int mat = 0;
        for(int i = 1; i <= n; i++)

        {
            System.out.println("enter value here: ");
            int num = sc.nextInt();

            if (mat < num) {
                mat = num;
            }

        }
        System.out.println("higest value is " + mat);
    }
}
