import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {

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
            

        System.out.print("Goodbye");

    }
}