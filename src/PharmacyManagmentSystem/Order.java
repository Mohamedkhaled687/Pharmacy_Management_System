package PharmacyManagmentSystem;

/**
 * @brief This is a class for a Order Specifications
 * @author [Mohamed Khaled]
 * @date [2025-04-18]
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Order {

    private int ID;
    private Employee pharmacist;
    private Employee cashier;
    private LocalDateTime dataTime;
    private double total;
    private ArrayList<Medicine> medicines;
    private double paid;
    private double change;
    private LocalDateTime payDateTime;
    private DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Constructor
    public Order() {
    };

    /**************************** Setters and Getters ****************************/

    // Setter and Getter for ID
    public int getID() {
        return ID;
    }

    void setID(int ID) {
        this.ID = ID;
    }

    // Setter and Getter for Pharmacist
    public Employee getPharmacist() {
        return pharmacist;
    }

    void setPharmacist(Employee pharmacist) {
        this.pharmacist = pharmacist;
    }

    // Setter and Getter for Cashier
    public Employee getCashier() {
        return cashier;
    }

    void setCashier(Employee cashier) {
        this.cashier = cashier;
    }

    // Setter and Getter for DataTime
    public String getDataTime() {
        return dataTimeFormatter.format(dataTime);
    }

    void setDataTime(String dataTime) {
        this.dataTime = LocalDateTime.parse(dataTime, dataTimeFormatter);
    }

    // Setter and Getter for Total
    public double getTotal() {
        return total;
    }

    void setTotal(double total) {
        this.total = total;
    }

    // Setter and Getter for Medicines
    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    // Setter and Getter for Paid
    public double getPaid() {
        return paid;
    }

    void setPaid(double paid) {
        this.paid = paid;
    }

    // Setter and Getter for change

    public double getChange() {
        return change;
    }

    void setChange(double change) {
        this.change = change;
    }

    // Setter and Getter for PayDateTime

    public String getPayDateTime() {
        return dataTimeFormatter.format(payDateTime);
    }

    void setPayDateTime(String payDateTime) {
        this.payDateTime = LocalDateTime.parse(payDateTime, dataTimeFormatter);
    }

    // Getter for DataTimeFormatter
    public String getDataTimeFormatter() {
        return "yyyy-MM-dd HH:mm:ss";
    }

}
