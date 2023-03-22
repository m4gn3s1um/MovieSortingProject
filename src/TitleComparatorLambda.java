import java.util.Comparator;

public class TitleComparatorLambda {

    public static Comparator<Movie> compareByTitle() {
        return (o1, o2) -> o1.getTitle().compareTo(o2.getTitle());
    }
}
