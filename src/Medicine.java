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
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

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

    public String getManufactureDate() {
        return dataFormatter.format(manufactureDate);
    }

}
