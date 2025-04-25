package PharmacyManagmentSystem;

/**
 * @brief This is a class for a CreateEmployee
 * @author [Mohamed Khaled]
 * @date [2025-04-18]
 */

import java.util.Scanner;

public class CreateEmployee implements Option {

    @Override
    public void operation(Database database, Scanner scanner, Employee employee) {
        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();

        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();

        System.out.println("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter Birth Date (yyyy-MM-dd): ");
        String birthDate = scanner.nextLine();

        System.out.println("Enter Work Hours: ");
        int workHours = scanner.nextInt();

        System.out.println("Enter Start Time (HH:mm): ");
        String startTime = scanner.nextLine();

        System.out.println("Enter End Time (HH:mm): ");
        String endTime = scanner.nextLine();

    }

    @Override
    public String toString() {
        return "Add new Employee";
    }

}
