package src.main.java.solid.good.i;

public class Manager implements IEmployee, IManager {
    private double salary;

    public void work() {
        // Manager-specific work implementation
        System.out.println("Manager is working.");
    }

    public void takeBreak() {
        // Manager-specific break implementation
        System.out.println("Manager is taking a break.");
    }

    public void attendMeeting() {
        // Manager-specific meeting implementation
        System.out.println("Manager is attending a meeting.");
    }

    public void manageTeam() {
        // Manager-specific team management implementation
        System.out.println("Manager is managing the team.");
    }

    public void setSalary(double salary) {
        // Manager-specific salary setting implementation
        this.salary = salary;
        System.out.println("Manager's salary has been set to: " + salary);
    }

    public void requestVacation(int days) {
        // Manager-specific vacation request implementation
        System.out.println("Manager has requested " + days + " days of vacation.");
    }

    public void submitReport() {
        // Manager-specific report submission implementation
        System.out.println("Manager has submitted a report.");
    }

    public void provideFeedback(IEmployee employee) {
        // Manager-specific feedback provision implementation
        System.out.println("Manager is providing feedback to employee: " + employee);
    }

    public void celebrateAchievement() {
        // Manager-specific celebration implementation
        System.out.println("Manager is celebrating an achievement.");
    }
}
