public class Employee {
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getGratuity() {
        return gratuity;
    }

    public long getJoiningDate() {
        return joiningDate;
    }

    private String name;
    private double baseSalary;
    private double gratuity;
    private long joiningDate;

    public Employee(String name, double baseSalary, double gratuity, long joiningDate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.gratuity = gratuity;
        this.joiningDate = joiningDate;
    }

    public void displayTotalSalary(){
        double totalSalary = baseSalary + gratuity;
        System.out.println("Total salary is: " + totalSalary + " per month");
    }

    public void displayEmployeeRole(){
        System.out.println("I am an instance of the type employee, I can do anything!");
    }
}
