class Car{
    //properties
    public String displayInfo(String brand, int topspeed){
        return "This is a " + brand + " and it goes "+ topspeed +" mph!";
    }
}
public class Classnobjects02 {
    static void main(String[] args) {
        Car car1 = new Car();
        String result = car1.displayInfo("audio", 267);
        System.out.println(result);
    }

}
