import java.util.Scanner;
public class WindChill
{
    public static void main(String[] args)
    {
        String ProgrammerName= "Kidus Tilahun";
        Scanner input = new Scanner (System.in);

        System.out.println("Wind Chill calculator.");

        System.out.print("please enter the temprature. (temperature in Fahrenheit (must be >= -45 and <= 40): ");
        double temprature;
        temprature = input.nextDouble();

        System.out.print("please enter the wind speed. (wind speed (must be >= 5 and <= 60): ");
        double velocity;
        velocity = input.nextDouble();

        double result;
        double velocityExponent = Math.pow (velocity,0.16);
        result= 35.74 + (0.6215*temprature) - (35.75*velocityExponent) + (0.4275*temprature*velocityExponent);

        System.out.println("\nThe wind Chill is " + result);
        System.out.println("Programmer = " + ProgrammerName);


    }
}
