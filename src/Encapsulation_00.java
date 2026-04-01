class Human{
    private String name;
    private int age;

    public String setname(String n){
        return name = n;
    }
    public String getname(){
        return name;
    }

    public int setage(int a){
        return age = a;
    }
    public int getage(){
        return age;
    }
}

public class Encapsulation_00 {
    static void main(String[] args) {
        Human h1 = new Human();
        h1.setname("Reddy");
        h1.setage(11);
        System.out.println(h1.getname() + " : " + h1.getage());
    }
}
