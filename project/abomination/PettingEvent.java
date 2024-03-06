package project.abomination;

import java.time.LocalTime;

public class PettingEvent extends ExhibitDecorator {
    public PettingEvent(Exhibit exhibit, LocalTime time) {
        this.exhibit = exhibit;
        this.time = time;
    }

    public String getDescription() {
        System.out.println("Petting Event at " + time);
        return exhibit.getDescription() + "Petting Event at " + time;
    }
    
}
