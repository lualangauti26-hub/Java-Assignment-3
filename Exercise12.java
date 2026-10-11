import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Score: ");
        double score = input.nextDouble();
        System.out.print("Attendance percentage: ");
        double attendance = input.nextDouble();

        if (score >= 60 && attendance >= 75) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        input.close();
    }
}
