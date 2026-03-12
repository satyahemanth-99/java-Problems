class Caluclators{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }
}
public class Classnobject07 {
    static void main(String[] args) {
        Caluclators cal = new Caluclators();
        double results = cal.add(3.5, 4.2, 5.2);
        System.out.println(results);
    }
}
