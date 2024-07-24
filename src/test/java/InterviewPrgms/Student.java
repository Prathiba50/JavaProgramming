package InterviewPrgms;

public class Student {

    int rollNo;
    String name;
    static String Clg = "MVIT";

    public static void change(){
        Clg = "BCE";
    }

    Student(int rollNo, String name){
       this. rollNo = rollNo;
       this. name = name;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+Clg);
    }

    public static void main(String[] args) {

        Student s1 = new Student(1,"Prathibha");
        Student s2 = new Student(2,"Ram");
        Student s3 = new Student(3,"Shyam");
        s1.display();
        s2.display();
        s3.display();

        change();
        Student s4 = new Student(4,"Gaurav");
        Student s5 = new Student(5,"Janu");
        Student s6 = new Student(6,"Pinky");

        s4.display();
        s5.display();
        s6.display();
    }

}
