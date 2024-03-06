package project.abomination;
import java.time.LocalTime;


public class OpenEvent extends ExhibitDecorator {
    public OpenEvent(Exhibit exhibit, LocalTime time) {
        this.exhibit = exhibit;
        this.time = time;
    }

    public String getDescription() {
        return exhibit.getDescription() + "Opens at " + time;
    }
}
