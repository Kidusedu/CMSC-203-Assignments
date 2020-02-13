import java.util.Scanner;
public class NumericTypes
{
    public static void main (String [] args) {



        Scanner input= new Scanner (System.in);//TASK #2 Create a Scanner object here
        final int NUMBER = 2; // number of scores



        System.out.print("please enter first score: ");// first test score entered by user
        int score1 = input.nextInt(); //Task #2 read score1

        System.out.print("please enter second score: ");//Task #2 prompt user to input score2
        int score2 = input.nextInt();  //Task #2 read score2

        final int BOILING_IN_F = 212; // boiling temperature
        // temprature entered by user in Fahrenheit
        double fToC; // temperature in Celsius
        double average; // arithmetic average
        String output; // line of output to print out

        average = (score1 + score2) / NUMBER;// Find an arithmetic average
        output = score1 + " and " + score2 + " have an average of " + average;
        System.out.println(output);

        fToC = (5/9) * (BOILING_IN_F - 32); // Convert Fahrenheit temperatures to Celsius
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(output);

        System.out.print("please enter another temprature in Fahrenheit: ");//Task #2 prompt user to input another temperature
        int Fahrenheit_user= input.nextInt();//Task #2 Declaring and reading the user�s temperature in Fahrenheit
        final double result = (5/9) * (Fahrenheit_user - 32);//Task #2 convert the user�s temperature to Celsius
        output = Fahrenheit_user+ " in Fahrenheit is " + result + " in Celsius.";//Task #2 print the user�s temperature in Celsius
        System.out.println(output);




        System.out.println("Goodbye"); // to show that the program is ended
    }
}
