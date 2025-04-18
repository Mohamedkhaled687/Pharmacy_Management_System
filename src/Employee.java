/*
 * @brief This is a class for an Employee Details
 * @author [Mohamed Khaled]
 * @date [2025-04-17]
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
    // Attributes
    private int ID;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String password;
    private double salary;
    private LocalDate birthDate;
    private int workHours;
    private LocalTime startTime;
    private LocalTime endTime;
    private Option[] options;
    private DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyy-dd-MM");
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

    // Default Constructor
    public Employee() {
    };

    /**************************** Setters and Getters ****************************/

    // Setter and Getter for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Setter and Getter for First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Setter and Getter for Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Setter and Getter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Setter and Getter for Phone Number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Setter and Getter for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Setter and Getter for Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Setter and Getter for Salary

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Setter and Getter for Birth Date

    public String getBirthDate() {
        return dataFormatter.format(birthDate);
    }

    public void setBirthData(String birthDate) {
        this.birthDate = LocalDate.parse(birthDate, dataFormatter);
    }

    // Setter and Getter for Work Hours
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    // Setter and Getter for Start Time
    public String getStartTime() {
        return timeFormatter.format(startTime);
    }

    public void setStartTime(String startTime) {
        this.startTime = LocalTime.parse(startTime, timeFormatter);
    }

    // Setter and Getter for End Time
    public String getEndTime() {
        return timeFormatter.format(endTime);
    }

    public void setEndTime(String endTime) {
        this.endTime = LocalTime.parse(endTime, timeFormatter);
    }

    // Setter and Getter for Options
    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

    // Getter for DataFormatter
    public String getDataFormatter() {
        return "yyyy-MM-dd";
    }

    // Getter for TimeFormatter
    public String getTimeFormatter() {
        return "HH:mm";
    }

}
