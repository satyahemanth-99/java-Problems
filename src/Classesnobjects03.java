class Computer{
    public void music(){
        System.out.println("Playing Music");
    }

    public String buypen(int money){
        if(money > 10){
            return "take pen";
        }else{
            return "no pen";
        }
    }
}
public class Classesnobjects03 {
    static void main(String[] args) {
        Computer comp1 = new Computer();
        comp1.music();
        String result = comp1.buypen(11);
        System.out.println(result);
    }
}
