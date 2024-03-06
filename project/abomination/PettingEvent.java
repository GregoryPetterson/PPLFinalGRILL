package project.abomination;

public class PettingEvent extends ExhibitDecorator {
    public PettingEvent(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public String getExhibitState() {
        return "Petting Event";
    }
    
}
