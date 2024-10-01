import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        boolean another;

        do {

            Scanner key = new Scanner(System.in);

            Movie movie = new Movie();

            System.out.print("Enter the title of a movie: ");
            movie.setTitle(key.nextLine());

            System.out.print("Enter the rating of the movie: ");
            movie.setRating(key.nextLine());

            System.out.print("Enter the number of tickets sold for this movie: ");
            movie.setSoldTickets(key.nextInt());
            key.nextLine();

            System.out.println(movie.toString());

            System.out.print("Would you like to enter another movie? (y or n)");
            String yor = key.nextLine();

            if (yor.compareTo("y") == 0) {
                another = true;
            } else {
                another = false;
            }

        } while (another == true);

        System.out.print("Goodbye");

    }
}