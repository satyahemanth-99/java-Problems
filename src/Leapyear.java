import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Leapyear {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter year here: ");

        short year = Short.parseShort(br.readLine());

        if(year % 4 == 0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is non-leap year");
        }
        br.close();
    }
}
