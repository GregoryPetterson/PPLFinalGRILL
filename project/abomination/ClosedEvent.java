package project.abomination;
import java.time.LocalTime; 

public class ClosedEvent extends ExhibitDecorator {
    public ClosedEvent(Exhibit exhibit, LocalTime time) {
        this.exhibit = exhibit;
        this.time = time;
    }
    
    public String getExhibitState() {
        return "This exhibit will be closed at " + time;
    }
}