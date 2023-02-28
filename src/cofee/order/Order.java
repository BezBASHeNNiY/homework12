package cofee.order;

public class Order {
    private String lastName;
    private int number;

    public Order(String lastName, int number) {
        this.lastName = lastName;
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order {" +
                "LastName : '" + lastName + '\'' +
                ", Number : " + number +
                '}';
    }

}
