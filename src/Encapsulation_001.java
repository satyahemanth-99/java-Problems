class Humann{
    private String name;
    private int age;


    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Encapsulation_001 {
    static void main(String[] args) {
        Humann h1 = new Humann();
        h1.setName("John");
        h1.setAge(11);

        System.out.println(h1.getName() + " : " + h1.getAge());
    }
}
