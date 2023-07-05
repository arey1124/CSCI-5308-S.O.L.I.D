package src.main.java.solid.good.i;

public class Main {
    public static void main(String args[]) {
        // Creating an instance of RegularEmployee
        Developer regularEmployee = new Developer();

        // Invoking regular employee-specific methods
        regularEmployee.setSalary(3000);
        regularEmployee.work();
        regularEmployee.takeBreak();
        regularEmployee.attendMeeting();
        regularEmployee.requestVacation(3);
        regularEmployee.submitReport();
        regularEmployee.celebrateAchievement();

        System.out.println("------------------------------------");


        // Creating an instance of Manager
        Manager manager = new Manager();

        // Invoking manager-specific methods
        manager.setSalary(5000);
        manager.work();
        manager.takeBreak();
        //The manager can manage a team
        manager.manageTeam();
        manager.attendMeeting();
        manager.requestVacation(5);
        manager.submitReport();
        // The manager can provide direct feedback to an employee
        manager.provideFeedback(new Developer());
        manager.celebrateAchievement();
    }
}
