class Student{
    public void greeting(){
        System.out.println("goooooooooooooood mooooooooooooooooring teacherrrrrrrrrrrrrrrrrrrrrrr!!!!!!!!!");
    }
    public String homework(String ans){
        if (ans.equals("yes")){
            return "I did Homework today";
        }else {
            return "Not i Didn't do Homework today";
        }
    }
}
public class Classnobjects05 {
    static void main(String[] args) {
        Student s1 = new Student();
        s1.greeting();
        String result = s1.homework("yes");
        System.out.println(result);
    }
}
