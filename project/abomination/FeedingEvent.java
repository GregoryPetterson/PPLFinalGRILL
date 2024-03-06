package project.abomination;
import java.time.LocalTime; 

public class FeedingEvent extends ExhibitDecorator {
    public FeedingEvent(Exhibit exhibit, LocalTime time) {
        System.out.println(time);
        this.exhibit = exhibit;
        this.time = time;
    }

    public String getDescription() {
        System.out.println(exhibit.getDescription());
        return  exhibit.getDescription() + "There will be a feeding at" + time;
    }
}
