package PharmacyManagmentSystem;
/*
 * @brief This is a class for an option
 * @author [Mohamed Khaled]
 * @date [2025-04-17]
 */

import java.util.Scanner;

public interface Option {

    abstract String toString();

    abstract void operation(Database database, Scanner scanner, Employee employee);
}
