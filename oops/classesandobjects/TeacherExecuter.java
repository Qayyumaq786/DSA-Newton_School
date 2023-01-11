package oops.classesandobjects;

import java.util.Scanner;

public class TeacherExecuter {

    public static void main(String[] args) {

        Teacher satyamSir = new Teacher("Satyam", "Physics");
        Teacher newSir = new Teacher();

        System.out.println(satyamSir.getName());

        System.out.println(newSir.getSubject());

        newSir.setName("Bibhuti");
        newSir.setSubject("Chemistry");

        System.out.println(newSir.getSubject());

        satyamSir.addSubjectTeacher(11, 'B');

        System.out.println(satyamSir.isSubjectTeacher(10,'B'));
        System.out.println(satyamSir.isSubjectTeacher(11,'B'));
    }
}
