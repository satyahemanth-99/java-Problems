class Mmath{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 +n3;
    }
}
public class ClassnObjects08 {
    static void main(String[] args) {
        Mmath mat1 = new Mmath();
        int result = mat1.add(2,3);
        System.out.println(result);
    }
}
