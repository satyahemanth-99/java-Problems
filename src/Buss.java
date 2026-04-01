class Buzz{
    private String Buzzname;

    //def constructor
    public Buzz(){
        Buzzname = "Benz";
    }

    //perameter constructor
    public Buzz(String Buzzname){
        this.Buzzname = Buzzname;
    }

    public String getBuzzname(){
        return Buzzname;
    }
}

public class Buss {
    static void main(String[] args) {
        Buzz b1 = new Buzz("Audi");
        System.out.println(b1.getBuzzname());
    }
}
