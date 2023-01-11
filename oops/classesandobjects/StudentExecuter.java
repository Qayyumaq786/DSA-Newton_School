package oops.classesandobjects;

public class StudentExecuter {
    public static void main(String[] args) {
        Student s1 = new Student("hardik", 12,11,'B');
        Student s2 = new Student("Kautik",23,10,'C');
        Student s3 = new Student("Neha", 11);
        Student s4 = new Student();

        s1.getName();
        s2.getRollNumber();

        s1.setName("Kartik");


        // Give error as below fields are private
        //        System.out.println(s1.name);
        //        System.out.println(s1.rollNumber);
        //        System.out.println(s1.standard);
        //        System.out.println(s1.section);
    }
}
