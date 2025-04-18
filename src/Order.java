
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

}
