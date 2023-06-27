package solid;

import solid.srp.models.FactoryCreator;
import solid.srp.models.Order;
import solid.srp.models.Save;
import solid.srp.models.SaveTo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new Order("", "", 0, 0);
        order = FactoryCreator.inputFromConsole();
        SaveTo.save(order);
    }
}
