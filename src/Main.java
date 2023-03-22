import java.util.*;

import static java.util.Collections.unmodifiableList;

public class Main {

    public static void main(String[] args) {

        List<Movie> movieList = new LinkedList<>();

        Movie m1 = new Movie(1,"Batman - return of the Knight", "Cristopher Nolan","Drama",2012,9.8);
        Movie m2 = new Movie(2,"The Last Kingdom", "Magnus Andersen","Action",2019,8.6);
        Movie m3 = new Movie(3,"You Before Me", "Quentin Tarantino","Romance",2017,9.2);
        Movie m4 = new Movie(4,"Interstellar", "Stein Bagger","Sci-fi",2015,9.3);
        Movie m5 = new Movie(5,"Mission Impossible", "Steve Smith","Action",2017,7.9);

        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);


        //Shuffle test
        //Collections.shuffle(movieList);

        // Sort test
        //Collections.sort(movieList);

        // Comparator - Rating
        //Collections.sort(movieList,new RatingComparator());

        // Comparator - Title
        //Collections.sort(movieList,new TitleComparator());



        //Collections.sort(movieList);
      //  System.out.println("First list: " + movieList + '\n');


        // Reverse order - tjekker på productionYear
       // Comparator c = Collections.reverseOrder();
        //Collections.sort(movieList, c);


        Comparator<Movie> titleComparator = TitleComparatorLambda.compareByTitle();
        movieList.sort(titleComparator);

        


        System.out.println(movieList);

    }
}