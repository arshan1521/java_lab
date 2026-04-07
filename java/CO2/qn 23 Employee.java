import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    
    Employee(int no, String name, double salary) {
        eNo = no;
        eName = name;
        eSalary = salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of employee " + (i + 1));

            System.out.print("Employee No: ");
            int no = sc.nextInt();

            System.out.print("Employee Name: ");
            String name = sc.next();

            System.out.print("Employee Salary: ");
            double salary = sc.nextDouble();

            emp[i] = new Employee(no, name, salary);
        }

       
        System.out.print("\nEnter employee number to search: ");
        int searchNo = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (emp[i].eNo == searchNo) {
                System.out.println("\nEmployee Found:");
                System.out.println("No: " + emp[i].eNo);
                System.out.println("Name: " + emp[i].eName);
                System.out.println("Salary: " + emp[i].eSalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}