import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Whileloop1 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        System.out.println("Enter Here: ");
        int a = Integer.parseInt(br.readLine());
        while(i < a){
            System.out.println("hello " + (i + 1));
            i++;
        }
    }
}
