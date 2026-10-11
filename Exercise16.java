import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Parking hours (whole number): ");
        int hours = input.nextInt();

        if (hours < 0) {
            System.out.println("Invalid hours");
        } else {
            int fee;

            if (hours == 0) {
                fee = 0;
            } else if (hours >= 6) {
                fee = 20000;
            } else {
                fee = 5000 + (hours - 1) * 3000;
            }

            System.out.println("Parking fee: Rp" + fee);
        }

        input.close();
    }
}
