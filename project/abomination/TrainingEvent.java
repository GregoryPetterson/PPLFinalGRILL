package project.abomination;

import java.time.LocalTime;

public class TrainingEvent extends ExhibitDecorator {
    public TrainingEvent(Exhibit exhibit, LocalTime time) {
        this.exhibit = exhibit;
        this.time = time;
    }

    public String getDescription() {
        return exhibit.getDescription() + "Training Event at " + time + "\n";
    }
}
