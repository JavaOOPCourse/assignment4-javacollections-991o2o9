package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public ActionHistoryService(){
        initializeActions();
    }

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("Submitted Java Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile Picture");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (!actions.isEmpty()){
            actions.removeLast();
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if (!actions.isEmpty()){
            System.out.println(actions.getFirst());
            System.out.println(actions.getLast());
        }
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> it = actions.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
