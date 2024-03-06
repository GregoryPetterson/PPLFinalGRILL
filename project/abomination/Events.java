package project.abomination;

import java.util.ArrayList;

// This class associates an exhibit with a list of times and their associated decorators.
public class Events {
    Exhibit exhibit;
    ArrayList<TimeAndDecorator> timeAndDecorator;

    public Events(Exhibit exhibit, ArrayList<TimeAndDecorator> timeAndDecorator ) {
        this.exhibit = exhibit;
        this.timeAndDecorator = timeAndDecorator;
    }

    public Exhibit getExhibit(){
        return exhibit;
    }

    public ArrayList<TimeAndDecorator> getTimeAndDecorator(){
        return timeAndDecorator;
    }
}
