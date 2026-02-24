package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public IssueService(){
        initializeIssues();
    }

    public void initializeIssues() {
        issues.add(new Issue(1,"Prod drop down"));
        issues.add(new Issue(3,"Bug"));
        issues.add(new Issue(2,"505 error"));
        issues.add(new Issue(5,"UI Typography error"));
        issues.add(new Issue(4,"route doesn't match with tz"));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        Issue mostIssue = issues.peek();
        if (mostIssue != null){
            System.out.println(mostIssue);
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if (!issues.isEmpty()) issues.poll();
        if (!issues.isEmpty()) issues.poll();
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(urgency,description));
    }
}