import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
 * @brief This is a class for a Medicine
 * @author [Mohamed Khaled]
 * @date [2025-04-17]
 */

public class Medicine {

    private int ID;
    private String name;
    private String type;
    private int quantity;
    private LocalDate manufactureDate;
    private LocalDate expirationDate;
    private String companyName;
    private double price;
    private DateTimeFormatter dataFormatter = DateTimeFormatter.ofPattern("yyy-dd-MM");

    // Constructor
    public Medicine() {

    }

    /**************************** Getters and Setters ****************************/

    // Setter and Getter for ID
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    // Setter and Getter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter and Getter for Type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Setter and Getter for Quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter and Getter for Manufacture Date
    public String getManufactureDate() {
        return dataFormatter.format(manufactureDate);
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = LocalDate.parse(manufactureDate, dataFormatter);
    }

    // Setter and Getter for Expiration Date
    public String getExpirationDate() {
        return dataFormatter.format(expirationDate);
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = LocalDate.parse(expirationDate, dataFormatter);
    }

    // Setter and Getter for Company Name
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Setter and Getter for Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
