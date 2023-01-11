package oops.classesandobjects;


import java.util.HashMap;
import java.util.HashSet;

/**
 *  Requirement of teacher class:
 *  1. Name of the teacher
 *  2. Subject they teach
 *  3. Classes and Section they teach for
 *  each class {key, value pair}
 *
 * Assume that a teacher only teaches one subject
 *
 * Create 2 constructors :
 * 1. Default constructor which sets name and subject = "", and teaches to an object
 * 2. Parameterized constructor which takes name and subject. and initializes the teaches map.
 *
 *
 * 1.Create getter methods for name and subject
 * 2. Create setter methods for name and subject
 * 3. Create a method to add a standard and section to teaches list
 * 4. Return a method to check if a teacher teaches a particular standard and section
 *
 */

public class Teacher {

    private String name;
    private String subject;
    private HashMap<Integer, HashSet<Character>> teaches;

    public Teacher(){
        this.name = "";
        this.subject = "";
        this.teaches = new HashMap<>();
    }

    public  Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
        this.teaches = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void addSubjectTeacher(int standard, char section){
        if(! this.teaches.containsKey(standard)){
            // Initialize new hashset to store sections for the standard
            this.teaches.put(standard, new HashSet<>());
        }

        // add new section to the standard
        this.teaches.get(standard).add(section);
    }

    public boolean isSubjectTeacher(int standard, char section){
        return this.teaches.containsKey(standard)
                && this.teaches.get(standard).contains(section);
    }

}
