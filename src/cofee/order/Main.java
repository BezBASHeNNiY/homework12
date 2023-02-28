package cofee.order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard test = new CoffeeOrderBoard();
        test.add("Jane");
        test.add("Mikey");
        test.add("German");
        test.add("Anna");
        test.deliver(2);
        test.deliver();
        test.add("Kate");


        test.draw();

    }
}