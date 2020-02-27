package Birthday;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class Birthday {
    public static void main(String[] args) {
        Toy person = new Toy();


        JOptionPane.showMessageDialog(null, "Welcome to the birthday shop!!");
        String name = JOptionPane.showInputDialog("Please enter the name of the Child: ");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the child: "));
        person.setAge(age);

        String toy_choice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book ");

        person.setCost(toy_choice);
        person.setToy(toy_choice);

        if (!person.ageOK()) {
            String choice = JOptionPane.showInputDialog("This toy is not age appropriate." +
                    " Would you like to cancel the toy request? (Yes or No)");
            while (choice.toLowerCase().equals("yes")) {

                name = JOptionPane.showInputDialog("Please enter the name of the Child: ");

                age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the child: "));
                person.setAge(age);

                toy_choice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book ");

                person.setCost(toy_choice);
                person.setToy(toy_choice);

                choice = "no";
            }


        }

        String card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
        person.addCard(card);

        String balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
        person.addBalloon(balloon);

        System.out.println("the gift for " + name + " " + person.toString());


        String again = JOptionPane.showInputDialog("Would you like to add another gift? (yes or no)");


        double TotCost = 0;

        TotCost = person.getCost();

        while (again.toLowerCase().equals("yes")) {
            name = JOptionPane.showInputDialog("Please enter the name of the Child: ");

            age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the child: "));
            person.setAge(age);

            toy_choice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book ");

            person.setCost(toy_choice);
            person.setToy(toy_choice);

            if (!person.ageOK()) {

                String choice = JOptionPane.showInputDialog("This toy is not age appropriate." +
                        " Would you like to cancel the toy request? (Yes or No)");
                while (choice.toLowerCase().equals("yes")) {

                    name = JOptionPane.showInputDialog("Please enter the name of the Child: ");

                    age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age of the child: "));
                    person.setAge(age);

                    toy_choice = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks or a book ");

                    person.setCost(toy_choice);
                    person.setToy(toy_choice);

                    TotCost = person.getCost();

                    choice = "no";
                }


            }


            card = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No");
            person.addCard(card);

            balloon = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No");
            person.addBalloon(balloon);

            System.out.println("the gift for " + name + person.toString());

            TotCost += person.getCost();

            again = JOptionPane.showInputDialog("Would you like to add another gift? (yes or no)");

        }


        Random num = new Random();
        int random_num = 10000 + num.nextInt(100000 - 10000);

        System.out.println("The total cost of your order is " + TotCost);
        System.out.println("order number is " + random_num);
        System.out.println("Programmer = Kidus Tilahun");


    }
}

