import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Traveler {
    public static void main(String[] args) throws IOException{
        // Budget Traveler
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your budget here: ");
        short budget = Short.parseShort(br.readLine());
//        short budget = sc.nextShort();
        if(budget > 5000 && budget < 10000){
            System.out.println("Train to Hampi");
        }else if(budget > 10000){
            System.out.println("Fly to Goa.");
        }else{
            System.out.println("Stay home and code.");
        }
        br.close();
    }
}
