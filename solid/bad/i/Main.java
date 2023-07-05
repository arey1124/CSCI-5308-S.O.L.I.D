package solid.bad.i;

public class Main {
    public static void main(String args[]) {
        // Creating an instance of RegularEmployee
        Developer regularEmployee = new Developer();

        // Invoking regular employee-specific methods
        regularEmployee.setSalary(3000);
        regularEmployee.work();
        regularEmployee.takeBreak();
        regularEmployee.manageTeam();
        regularEmployee.attendMeeting();
        regularEmployee.requestVacation(3);
        regularEmployee.submitReport();
        regularEmployee.provideFeedback(new Developer());
        regularEmployee.celebrateAchievement();

        System.out.println("------------------------------------");


        // Creating an instance of Manager
        Manager manager = new Manager();

        // Invoking manager-specific methods
        manager.setSalary(5000);
        manager.work();
        manager.takeBreak();
        manager.manageTeam();
        manager.attendMeeting();
        manager.requestVacation(5);
        manager.submitReport();
        manager.provideFeedback(new Developer());
        manager.celebrateAchievement();

    }
}
