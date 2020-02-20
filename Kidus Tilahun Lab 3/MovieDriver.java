import  java.util.Scanner;
public class MovieDriver

{
    public static void main(String[] args)

    {
        Scanner input = new Scanner (System.in);
        Movie movie = new Movie();

        System.out.print("Please enter the title of the movie: \n");

        String title = input.nextLine();
        movie.setTitle(title);

        System.out.print("Please enter the movie's ratings: \n");
        String rating = input.nextLine();
        movie.setRating(rating);

        System.out.print("please enter the number of tickets sold at the theater: \n");
        int tickets = input.nextInt();
        movie.setSoldTickets(tickets);

        System.out.println(movie.toString());


        System.out.println("do you want to enter information for another movie?" +
                "(y/n)");
        String check = input.next();



            while (check.toLowerCase().equals("y"))
            {
                System.out.print("Please enter the title of the movie: \n");

                title = input.next();

                movie.setTitle(title);

                System.out.print("Please enter the movie's ratings: \n");
                rating = input.next();
                movie.setRating(rating);

                System.out.print("please enter the number of tickets sold at the theater: \n");
                tickets = input.nextInt();
                movie.setSoldTickets(tickets);

                System.out.println(movie.toString());

                System.out.println("do you want to enter information for another movie?" +
                        "(y/n)");
                check = input.next();
            }

        System.out.println("Good Bye!!");
    }

}










