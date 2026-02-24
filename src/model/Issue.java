package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent

    // TODO: create constructor
    public Issue( int urgencyLevel,String description){
        this.description = description;
        this.urgencyLevel = urgencyLevel;
    }

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }

    // TODO: override toString()
    @Override
    public String toString(){
        return "Issue Urgency Level: " +  urgencyLevel + ", Description: " + description;
    }
}
