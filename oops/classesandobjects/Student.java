package oops.classesandobjects;

public class Student {
    private int rollNumber;
    private String name;
    private int standard;
    private char section;

    // Default constructor
    public Student(){
    }

    // Polymorphism as same name but different functionality
    // Constructor overloading
    public Student(String s, int r, int st, char se){
        name = s;
        rollNumber = r;
        standard = st;
        section = se;
    }

    // Constructor overloading
    public Student(String s, int st){
        name = s;
        standard = st;
    }

    public String getName(){
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getStandard() {
        return standard;
    }

    public char getSection() {
        return section;
    }

    public void setName(String s){
        name = s;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public void setSection(char section) {
        this.section = section;
    }
}
