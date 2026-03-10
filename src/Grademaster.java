import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Grademaster {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter marks Here: ");
        byte marks = Byte.parseByte(br.readLine());
        if(marks >= 90){
            System.out.println("A grade");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("B Grade");
        }else if( marks >= 70 && marks <= 79){
            System.out.println("C grade");
        }else{
            System.out.println("Keep Practicing");
        }
    }
}
