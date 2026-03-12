class Cars{
    public void music(){
        System.out.println("Music is Playing . . . ");
    }
    public String setting(int seats){
        if(seats >= 4){
            return "Its a car buy this car only";
        }else {
            return "Not a car, don't buy";
        }
    }
}
public class Classesnobjects04 {
    static void main(String[] args) {
        Cars c1 = new Cars();
        c1.music();
        String results = c1.setting(3);
        System.out.println(results);
    }
}
