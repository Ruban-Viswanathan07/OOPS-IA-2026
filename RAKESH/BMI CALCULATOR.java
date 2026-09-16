import java.util.Scanner;

class InvalidBMIException extends Exception {
    public InvalidBMIException(String message) {
        super(message);
    }
}

public class Main {

    static double calculateBMI(double weight, double height)
            throws InvalidBMIException {

        double bmi = weight / (height * height);

        if (bmi <= 0) {
            throw new InvalidBMIException("Invalid BMI: BMI cannot be zero or negative.");
        }

        return bmi;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter height in meters: ");
            double height = sc.nextDouble();

            // Prevent division by zero
            if (height == 0) {
                throw new InvalidBMIException("Invalid height: Height cannot be zero.");
            }

            double bmi = calculateBMI(weight, height);

            System.out.println("Calculated BMI = " + bmi);

        } catch (InvalidBMIException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }

        sc.close();
    }
}
