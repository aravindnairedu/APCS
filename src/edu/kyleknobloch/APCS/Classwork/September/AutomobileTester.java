import java.util.Scanner;

public class AutomobileTester {



    public static void main (String args[]) {
        Scanner console = new Scanner(System.in);
        double price;
        Automobile car = new Automobile(1990, "Mr. Drugan", "World of Warcraft", 100000, "Blue", 8.5, 19990);


        System.out.println(car.toString());

        System.out.println("Please enter the final price: ");
        price = console.nextDouble();

        Automobile car2 = new Automobile(price);
        System.out.println(car.toString());


    }
}
