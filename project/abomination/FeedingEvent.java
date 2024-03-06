package project.abomination;
import java.time.LocalTime; 

public class FeedingEvent extends ExhibitDecorator {
    public FeedingEvent(Exhibit exhibit, LocalTime time) {
        this.exhibit = exhibit;
        this.time = time;
    }

    public String getDescription() {
        return  exhibit.getDescription() + "Feeding at " + time + "\n";
    }
}
