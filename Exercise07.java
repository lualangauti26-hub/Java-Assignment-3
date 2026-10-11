import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();

        if (a > b) {
            System.out.println("a is larger: " + a);
        } else if (b > a) {
            System.out.println("b is larger: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
