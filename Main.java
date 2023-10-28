import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("ali",123456,20,50);
        e.displayinfo();
        e.displaysalary();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Employee name :");
        String name = s.nextLine();
        System.out.println("Enter the worker's Social Security Number: ");
        int SSN = s.nextInt();

        System.out.println("Enter the worker's hourly wage: ");
        int wage = s.nextInt();
        System.out.println("Enter the number of hours worked: ");
        int hours = s.nextInt();

        Employee e2 = new Employee(name,SSN,wage,hours);
        e2.displayinfo();
        e2.displaysalary();

    }
}
