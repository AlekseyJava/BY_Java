import java.util.Date;
import java.util.Objects;

public class Train {
    private String destination;
    private int numberTrain;
    private Date departureDate;

    public String getDestination() {
        return destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Train(String destination, int numberTrain, Date departureDate) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.departureDate = departureDate;
    }


    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", departureDate=" + departureDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return numberTrain == train.numberTrain &&
                destination.equals(train.destination) &&
                departureDate.equals(train.departureDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, numberTrain, departureDate);
    }
}


