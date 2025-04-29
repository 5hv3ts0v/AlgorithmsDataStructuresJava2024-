import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("001", "Іван Петренко", Arrays.asList("Борщ", "Полениця", "Котлета"));
        Order order2 = new Order("002", "Олена Дмитрієва", Arrays.asList("Паста", "Тірамісу"));
        Order order3 = new Order("003", "Петро Кулик", Arrays.asList("Уха", "Чай"));

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);
        restaurant.addOrder(order3);

        System.out.println("Всі замовлення:");
        restaurant.printAllOrders();

        String searchOrder = "002";
        System.out.println("\nПошук замовлення з номером " + searchOrder + ":");
        Order foundOrder = restaurant.findOrder(searchOrder);
        if (foundOrder != null) {
            System.out.println(foundOrder);
        } else {
            System.out.println("Замовлення не знайдено.");
        }

        restaurant.removeOrder("001");

        System.out.println("\nСписок замовлень після видалення №001:");
        restaurant.printAllOrders();
    }
}
