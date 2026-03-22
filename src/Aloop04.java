class Studenttt{
    int marks;
    String name;
    int rollNo;
}

public class Aloop04 {
    static void main(String[] args) {
        Studenttt s1 = new Studenttt();
        s1.name = "Hamza";
        s1.rollNo = 43;
        s1.marks = 75;

        Studenttt s2 = new Studenttt();
        s2.name = "Rehman";
        s2.rollNo = 24;
        s2.marks = 87;

        Studenttt s3 = new Studenttt();
        s3.name = "Iqbal";
        s3.rollNo = 12;
        s3.marks = 95;

        Studenttt Students[] = new Studenttt[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for(int i = 0; i<Students.length; i++){
            System.out.println(Students[i].name + " : " + Students[i].marks);
        }
    }
}
