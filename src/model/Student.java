package model;

public class Student {

    // TODO: declare fields
    private int id;
    private String name;
    private double gpa;

    // TODO: create constructor
    public Student(int id, String name,double gpa){
        this.id = id;
        this.name=name;
        this.gpa = gpa;
    }

    // TODO: create getters

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getId() {
        return id;
    }


    // TODO: override toString()
    @Override
    public String toString(){
        return "Name: " + name + ", gpa: " + gpa;
    }

}
