public class Loopsprobs01 {
    static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop:");
        for(int i = 1; i <= 5; i++){
            System.out.print(" " + i);
        }

        // TODO: Print numbers 1 to 5 using while loop
        System.out.println(" ");
        int x = 1;
        System.out.print("While Loop:");
        while(x<=5){
            System.out.print(" " + x);
            x++;
        }

        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print(" ");
        int a = 1;
        System.out.print("Do-While Loop:");
        do{
            System.out.print(" " + a);
            a++;
        }while(a<=5);
    }
}
