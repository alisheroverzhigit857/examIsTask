import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cast cast = new Cast("Baiel", "Capitan America ");
        Cast cast1 = new Cast("Ruslan", "Hulk");
        Cast cast2 = new Cast("Momun", "Flash");
        Director director = new Director("Kairat", "Nurdinov");
        Cast[] casts = {cast, cast1, cast2};


        Cast cast3 = new Cast("Malik ", "Mr Been");
        Cast cast4 = new Cast("Erzhigit", "Rejissor");
        Director director1 = new Director("Kanymgul", "Kanymgul");
        Cast[] casts1 = {cast3, cast4};

        Cast cast5 = new Cast("Madina ", "Monester");
        Cast cast6 = new Cast("Kanykei ", "Monester Friend ");
        Director director2 = new Director("Aizat", "Duisheva");
        Cast[] casts2 = {cast5, cast6};


        Movie movie = new Movie("Marvel", 2018, "Fantastic ", director, casts);
        Movie movie1 = new Movie("Mr Been ", 2014, "Fantastic", director1, casts1);
        Movie movie2 = new Movie("Monester University", 2019, "Fantastic", director2, casts2);
        Movie[] movies = {movie, movie1, movie2};

        Film film = new Film();
        Film film1 = new Film();
        Film film2 = new Film();

        System.out.println("Write name Movie");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();

            switch (a) {
                case"Marvel":
                    film.findMovieByActorName(movies);
                    break;
                case"Mr Been":
                    film1.findMovieByActorName(movies);
                    break;
                case"Monester University":
                    film2.findMovieByActorName(movies);
                    break;
                default:
                    System.out.println("Mynday film jok");
            }
        }
    }
}

