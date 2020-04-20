import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("Moskow", 9, new Date()));
        Thread.sleep(1000);
        trains.add(new Train("Saratov", 10, new Date()));
        Thread.sleep(1000);
        trains.add(new Train("Moskow", 8, new Date()));
        Thread.sleep(500);
        trains.add(new Train("Saratov", 3, new Date()));
        Thread.sleep(500);
        trains.add(new Train("Moskow", 19, new Date()));

        System.out.println("Enter number train to print");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        informationByNumber(trains, number);

        System.out.println("Sort by number");
        sortByNumber(trains);
        print(trains);

        System.out.println("Sort by destination and departure date");
        sortByDeparture(trains);
        print(trains);
    }

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
        for (Train train : trains) {
            if (train.getNumberTrain() == number) {
                System.out.println(train.toString());
            }
        }
    }

    public static void print(List<Train> trains) {
        System.out.println();
        for (Train train : trains) {
            System.out.println(train);
        }
    }

}
