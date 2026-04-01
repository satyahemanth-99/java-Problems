class Humannn{
    private String name;

    public Humannn(){
        name = "john";
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

public class Encapsulation_002 {
    static void main(String[] args) {
        Humannn h1 = new Humannn();
//        h1.setName("Bob");
        System.out.println(h1.getName());
    }
}
