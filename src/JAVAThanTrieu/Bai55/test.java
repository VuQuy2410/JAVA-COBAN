package JAVAThanTrieu.Bai55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        ArrayList<Movie> movies= new ArrayList<>();
        movies.add(new Movie("Thor", 2011, "ABC", 59, 4.3f));
        movies.add(new Movie("Iron Man", 2013, "DEF", 79, 4.5f));
        movies.add(new Movie("Ant Man", 2015, "ABC", 75, 4.5f));
        movies.add(new Movie("Captain Marvel", 2019, "ABC", 59, 4.7f));
        movies.add(new Movie("Avengers: Infinity War", 2018, "ABC", 50, 4.8f));
        movies.add(new Movie("Avengers: End Game", 2019, "ABC", 99, 4.9f));

        System.out.println("==> Trước khi sắp xếp: ");
        showMovies(movies);
        System.out.println("\n==> Sau khi sắp xếp theo tên tăng dần từ a-z: ");
        Collections.sort(movies, new SortByName());
        showMovies(movies);

        System.out.println("\n==> Sau khi sắp xếp theo tên giảm dần từ a-z: ");
        Collections.sort(movies, new SortByNameDESC());
        showMovies(movies);

        System.out.println("\n==> Sau khi sắp xếp theo năm từ cũ đến mới: ");
        Collections.sort(movies, new SortByYear());
        showMovies(movies);

    }

    private static void showMovies(ArrayList<Movie> movies) {
        System.out.printf("%-25s%-10s%-10s%-10s%-10s\n",
                "Tên Phim", "Năm SX", "Đạo Diễn", "Giá Vé", "Số sao");

        for (Movie movie: movies){
            System.out.printf("%-25s%-10d%-10s%-10.2f%-10.2f\n",
                    movie.getName(), movie.getYear(), movie.getDirector(),
                    movie.getPrice(), movie.getStart());
        }
    }
}

/**
 * Sắp xếp movie tên tăng dần từ a-z
 */

class SortByName implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

/**
 * Sắp xếp movie giảm dần từ Z-a
 */
class SortByNameDESC implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

/**
 * Sắp xếp movie theo năm sản xuất từ cũ đến mới
 */

class SortByYear implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear()-o2.getYear();
    }
}