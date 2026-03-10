import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Login {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter UserName Here: ");
        String userName = br.readLine();
        System.out.println(userName);
        System.out.println("Enter Password Here: ");
        String password = br.readLine();
        System.out.println(password);
        if(userName.equals("Satya") && password.equals("123")){
            System.out.println("login successfully");
        }else{
            System.out.println("Please try later");
        }
    }
}
