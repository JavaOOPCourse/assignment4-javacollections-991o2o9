package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public AppointmentService(){
        initializeAppointments();
    }

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Python assignment");
        appointments.add("JavaScript assignment");
        appointments.add("C assignment");

        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("Java Assignment *");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (!appointments.isEmpty()){
            appointments.removeLast();
        }
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        if (!appointments.isEmpty()) {
            System.out.println("First: " + appointments.getFirst());
            System.out.println("Last: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
