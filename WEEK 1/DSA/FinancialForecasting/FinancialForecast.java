import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double amount, double growthRate, int years) {

        // Base condition
        if (years == 0) {
            return amount;
        }

        // Recursive call
        return calculateFutureValue(
                amount * (1 + growthRate),
                growthRate,
                years - 1
        );
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Initial Investment Amount: ");
        double amount = scanner.nextDouble();


        System.out.print("Enter Annual Growth Rate (%): ");
        double rate = scanner.nextDouble();


        System.out.print("Enter Number of Years: ");
        int years = scanner.nextInt();


        // Convert percentage into decimal
        double growthRate = rate / 100;


        double futureValue = calculateFutureValue(
                amount,
                growthRate,
                years
        );


        System.out.println(
                "Future Value after " + years +
                " years = " + futureValue
        );


        scanner.close();
    }
}