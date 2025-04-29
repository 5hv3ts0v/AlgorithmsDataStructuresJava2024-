import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private String customerName;
    private List<String> dishes;

    public Order(String orderNumber, String customerName, List<String> dishes) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.dishes = new ArrayList<>(dishes);
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<String> getDishes() {
        return new ArrayList<>(dishes);
    }

    @Override
    public String toString() {
        return "Замовлення: " + orderNumber +
               ", Клієнт: " + customerName +
               ", Страви: " + dishes;
    }
}
