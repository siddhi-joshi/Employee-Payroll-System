import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PayrollService payrollService = new PayrollService();

        System.out.println("1. Full-Time Employee");
        System.out.println("2. Part-Time Employee");
        System.out.print("Select Employee Type: ");
        int choice = sc.nextInt();

        Employee employee = null;

        if (choice == 1) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Monthly Salary: ");
            double salary = sc.nextDouble();

            employee = new FullTimeEmployee(id, name, salary);
        }
        else if (choice == 2) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Hourly Rate: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Hours Worked: ");
            int hours = sc.nextInt();

            employee = new PartTimeEmployee(id, name, rate, hours);
        }
        else {
            System.out.println("Invalid Choice");
            System.exit(0);
        }

        payrollService.generatePayslip(employee);
        sc.close();
    }
}