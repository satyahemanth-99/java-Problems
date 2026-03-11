import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Forloop1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many times you wanted to repete?, Enter Here: ");
        byte a = Byte.parseByte(br.readLine());
        for(byte i = 0; i <= a - 1; i++){
            System.out.println("Hello World!");
        }
    }
}
