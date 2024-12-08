import java.util.Scanner;

        //Celsius to Fahrenheit
        // F = (C * 9/5) + 32
        //Fahrenheit to Celsius
        // C = (F - 32) * 5/9
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Temperature Converter ");

        //List of options for conversions
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        //Prompt user to choose an option
        System.out.println("Choose among the options");
        int userChoice = scanner.nextInt();

        //Prompt user for temperature value
        System.out.println("Enter the temperature value: ");


        double temperatureValue = scanner.nextDouble();

        //Perform calculation based on user's choice
        if (userChoice == 1) {
            double fahrenheit = inFahrenheit(temperatureValue);
            System.out.println("The value for " + temperatureValue + " in Fahrenheit is: " + fahrenheit);
            System.out.println("Thank you");
        } else if (userChoice == 2) {
            double celsius = inCelsius(temperatureValue);
            System.out.println("The value for " + temperatureValue + " in Celsius is: " + celsius);
            System.out.println("Thank you");
        }else {
            System.out.println("Invalid choice!!!\n Please enter 1 or 2. ");
        }
    }

    // Method to convert Celsius to Fahrenheit
    public static double inFahrenheit(double temperatureValue){
        return (temperatureValue * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double inCelsius(double temperatureValue){
        return (temperatureValue - 32) * 5/9;
    }
}