import java.util.Scanner;

public class Array06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Range Here: ");
        int len = sc.nextInt();

        int[] arrays = new int[len];
        int num = 0;
        for(int i = 0; i < len; i++){
            arrays[i] = i * i;
        }
        for(int j = 0; j < arrays.length; j++){
            System.out.println(arrays[j]);
        }
    }
}
