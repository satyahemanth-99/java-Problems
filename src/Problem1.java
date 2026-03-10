import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year here: ");
        short year = sc.nextShort();
        if(year % 4 == 0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is non-leap year");
        }
    }
}
