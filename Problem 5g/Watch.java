import java.util.ArrayList;
import java.util.List;

public class Watch {
    private int rating;
    private List<Watch> watchList;

    // fully parameterized constructor
    public Watch(int rating, List<Watch> watchList) {
        this.rating = rating;
        this.watchList = new ArrayList<>(watchList);
    }
}
