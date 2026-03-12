class Rectangle{
    public int getArea(int length, int width){
        return length * width;
    }
}
public class Classnobjects06 {
    static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        int result = r1.getArea(10,15);
        System.out.println(result);
    }
}
