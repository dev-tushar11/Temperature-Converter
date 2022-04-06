import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("enter key: ");
        int key = sc.nextInt();

        if (key == 1) {
            System.out.print("Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 1.8 * celsius + 32;

            System.out.println("Fahrenheit: " + fahrenheit);
        } else if (key == 2) {
            System.out.print("Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) / 1.8;

            System.out.println("Celsius: " + celsius);
        } else {
            System.out.println("Wrong input !!");
        }
    }
}
