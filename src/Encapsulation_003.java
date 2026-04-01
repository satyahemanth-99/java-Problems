class Humannnn{
    private String name;

    //default constructor
    public Humannnn(){
        name = "Ram";
    }
    //perameterized constructor
    public Humannnn(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation_003 {
    static void main(String[] args) {
        Humannnn h1 =  new Humannnn("Kalpak");
        System.out.println(h1.getName());
    }
}
