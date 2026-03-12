class Calculator{
    public int add(int n1, int n2){
        int r = n1 + n2;
        return r;
    }
}

public class Classnobjects01 {
    public static void main(String[] args){
        Calculator cal1 = new Calculator();
        int a = 5;
        int b = 6;
        int result = cal1.add(a, b);
        System.out.println(result);
    }
}
