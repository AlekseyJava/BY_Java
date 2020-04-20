import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void sortByNumber(List<Train> trains) {
        Collections.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumberTrain() - o2.getNumberTrain();
            }
        });
    }

    public static void sortByDeparture(List<Train> trains) {
        Collections.sort(trains, Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureDate));
    }

    public static void informationByNumber(List<Train> trains, int number) {
        for(Train train : trains) {
            if(train.getNumberTrain()==number) {
                System.out.println(train.toString());
            }
        }
    }
}
