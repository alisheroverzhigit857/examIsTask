import java.util.Locale;
import java.util.Scanner;

public class Film implements Findable {

    @Override
    public void getAllMovies(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

    @Override
    public void findMovieByName(Movie[] movies) {
        for (Movie m : movies) {

            System.out.println("Name movie ");
            String name = new Scanner(System.in).nextLine();
            if (m.getName().equals(name)) {
                System.out.println(m.toString());
            }
        }
    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        System.out.println("Name actor ");
        String name = new Scanner(System.in).nextLine();
        for (Movie m : movies) {
            for (Cast c : m.getCasts()) {
                if (c.getActorFullName().equalsIgnoreCase(name)) {
                    System.out.println(m);
                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        int a = new Scanner(System.in).nextInt();
        for (Movie m : movies) {
            System.out.println("Write movie year ");
            if (m.getYear() == a) ;
            {
                System.out.println(m.toString());
            }
        }
    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println("Write director ");
            String name = new Scanner(System.in).nextLine();
            if (m.getDirector().getName().equals(name)) {
                System.out.println(m.toString());
            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println("Write Discription ");
            String name = new Scanner(System.in).nextLine();
            if (m.getDescription().equals(name)) ;
            System.out.println(m);
        }
    }


    @Override
    public void findMovieByRole(Movie[] movies) {
        for (Movie m : movies) {
            System.out.println("Write role ");
            String name = new Scanner(System.in).nextLine();
            for (Cast cast : m.getCasts()) {
                if (cast.getRole().equalsIgnoreCase(name)) {
                    System.out.println(m);
                }
            }
            System.out.println(m.toString());

        }
    }
}


//    @Override
//    public void getAllMovies(Movie[] movies) {
//        for (Movie m : movies) {
//            System.out.println(m.toString());
//
//        }
//    }
//
//    @Override
//    public void findMovieByName(Movie[] movies) {
//        for (Movie m : movies) {
//
//            System.out.println("Name movie ");
//            String name = new Scanner(System.in).nextLine();
//            if (m.getName().equals(name)) {
//                System.out.println(m.toString());
//            }
//        }
//    }
//}
//    @Override
//    public void findMovieByActorName(Movie[] movies) {
//            for (Movie m : movies ) {
//                System.out.println("Name actor ");
//                String name = new Scanner(System.in).nextLine();
//                for (Cast c: m.getCasts()) {
//                    if (c.getActorFullName().equals(name.toUpperCase(Locale.ROOT)));
//                    System.out.println(m.toString());
//                }
//            }
//    }
//
//    @Override
//    public void findMovieByYear(Movie[] movies) {
//            for (Movie m : movies ) {
//                System.out.println("Write movie year ");
//                if (m.getYear() == year); {
//                    System.out.println(m.toString());
//                }
//            }
//    }
//
//    @Override
//    public void findMovieByDirector(Movie[] movies) {
//            for (Movie m : movies) {
//                System.out.println("Write director ");
//                String name = new Scanner( System.in).nextLine();
//                if (director.getName().equals(name)) {
//                    System.out.println(m.toString());
//                }
//            }
//    }
//
//    @Override
//    public void findMovieByDescription(Movie[] movies) {
//            for (Movie m : movies ) {
//                System.out.println("Write Discription ");
//                String name = new Scanner(System.in).nextLine();
//                if (m.getDescription().equals(name));
//                System.out.println(m.toString());
//            }
//    }
//
//    @Override
//    public void findMovieByRole(Movie[] movies) {
//            for (Movie m : movies ) {
//                System.out.println("Write role ");
//                String name = new Scanner(System.in).nextLine();
//                for (Cast c: casts ) {
//                    if (c.getRole().equals(name));
//                    System.out.println(m.toString());
//                }
//            }


