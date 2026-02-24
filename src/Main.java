import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("*All students*");
                    studentService.printStudents();
                    System.out.println("*************");
                    break;
                case 2:
                    System.out.println("*All appointments*");
                    appointmentService.printAppointments();
                    System.out.println("*************");
                    break;
                case 3:
                    System.out.println("*All Issues*");
                    issueService.printRemainingIssues();
                    System.out.println("*************");
                    break;
                case 4:
                    System.out.println("*Action History*");
                    actionService.printHistory();
                    System.out.println("*************");
                    break;
                case 5:
                    System.out.print("Enter issue urgency (1-5): ");
                    int urgency = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter description for issue: ");
                    String text = scanner.nextLine();
                    issueService.addNewIssue(text,urgency);
                    break;
                case 6:
                    actionService.undoLastAction();
                    System.out.println("*After update*");
                    actionService.printHistory();
                    System.out.println("*************");
                    break;
                case 7:
                    System.out.println("Exiting... 👋");
                    break;
                default:
                    System.out.println("Invalid option ❌");
            }

        } while (choice != 7);

        scanner.close();
    }
}
