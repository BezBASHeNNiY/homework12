package cofee.order;

import java.util.ArrayList;

public class CoffeeOrderBoard {
    private static ArrayList<Order> orders = new ArrayList<>();

    public void add(String lastName) {
        if (orders.size() != 0) {
            orders.add(new Order(lastName, orders.get(orders.size() - 1).getNumber() + 1));
        } else {
            orders.add(new Order(lastName, 1));
        }
    }

    public void deliver() {
        orders.remove(0);
    }

    public void deliver(int number) {
        orders.remove(number);
    }

    public void draw() {
        System.out.println("===============");
        System.out.println("Num  |   Name  ");
        for (Order element : orders) {
            System.out.println(" " + element.getNumber() + "  |  " + element.getLastName());
        }
    }

}
