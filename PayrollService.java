public class PayrollService implements PayrollCalculator {

    public double calculateTax(double salary) {
        return salary * 0.10; // 10% tax
    }

    public void generatePayslip(Employee employee) {
        double salary = employee.calculateSalary();
        double tax = calculateTax(salary);
        double netSalary = salary - tax;

        System.out.println("\n----- PAYSLIP -----");
        System.out.println("Employee ID   : " + employee.getId());
        System.out.println("Employee Name : " + employee.getName());
        System.out.println("Gross Salary  : ₹" + salary);
        System.out.println("Tax Deduction : ₹" + tax);
        System.out.println("Net Salary    : ₹" + netSalary);
        System.out.println("-------------------\n");
    }
}