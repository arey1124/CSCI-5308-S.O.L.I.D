package solid.good.i;

public class Developer implements IEmployee {
    private double salary;
    public void work() {
        // Regular employee-specific work implementation
        System.out.println("Developer is working.");
        System.out.println("Developer is coding a given task.");
        System.out.println("Developer is working with the testers to verify test scenarios.");
    }

    public void takeBreak() {
        // Regular employee-specific break implementation
        System.out.println("Developer is taking a break.");
    }

    public void attendMeeting() {
        // Regular employee-specific meeting implementation
        System.out.println("Developer is attending a meeting.");
    }

    public void setSalary(double salary) {
        // Regular employee-specific salary setting implementation
        this.salary = salary;
        System.out.println("Regular employee's salary has been set to: " + salary);
    }

    public void requestVacation(int days) {
        // Regular employee-specific vacation request implementation
        System.out.println("Developer has requested " + days + " days of vacation.");
    }

    public void submitReport() {
        // Regular employee-specific report submission implementation
        System.out.println("Developer has submitted a report.");
    }

    public void celebrateAchievement() {
        // Regular employee-specific celebration implementation
        System.out.println("Developer is celebrating an achievement.");
    }
}
