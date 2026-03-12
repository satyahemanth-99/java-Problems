class Car{
    //properties
    public String displayInfo(String brand, int topspeed){
        return "This is a " + brand + " and it goes "+ topspeed +" mph!";
    }
}
public class Classnobjects02 {
    static void main(String[] args) {
        Car mysportcar = new Car();
        String result = mysportcar.displayInfo("audio", 267);
        System.out.println(result);

        Car mytruck = new Car();
        System.out.println(mytruck.displayInfo("Ford", 90));
    }

}
