public class PartTimeEmployee implements Employee {

    private int id;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        this.id = id;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}