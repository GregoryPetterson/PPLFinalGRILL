package project.abomination;
import java.time.LocalTime; 

public abstract class ExhibitDecorator extends Exhibit {
    Exhibit exhibit;
    LocalTime time;
    public abstract String getExhibitState();
}