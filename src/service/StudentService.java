package service;

import model.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentService(){
        initializeStudents();
    }

    public void initializeStudents() {
        students.add(new Student(1,"Amin",4.0));
        students.add(new Student(2,"Alim",3.3));
        students.add(new Student(3,"Amina",2.5));
        students.add(new Student(4,"Lima",3.4));
        students.add(new Student(5,"Amir",2.8));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            if (it.next().getGpa() < 2.0) {
                it.remove();
            }
        }
    }

    public void findHighestGPA() {
        if (students.isEmpty()) {
            System.out.println("No students");
            return;
        }
        Student best = students.getFirst();
        double currentGpa = best.getGpa();

        for (Student s : students) {
            if (s.getGpa() > currentGpa) {
                currentGpa = s.getGpa();
                best = s;
            }
        }
        System.out.println("Student with high gpa: ");
        System.out.println(best);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        students.add(2,new Student(6,"Alex",3.6));
    }

    public void printStudents() {
        // TODO: Print using Iterator
            Iterator<Student> iterator = students.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
    }
}
