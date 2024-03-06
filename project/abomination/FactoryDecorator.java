package project.abomination;

import java.util.ArrayList;

import project.abomination.Administration.EnumDecorator;
import project.abomination.Administration.EnumExhibit;

public class FactoryDecorator {

    public void exhibitFactoryDecorator(Event event) {
        // initialize decorator
        Exhibit decorator = event.getExhibit();

        // Decorate it accordingly based on what zooAdmin notified us about events.

        for (EnumDecorator dec : event.getDecorators()) {

            // open or close the exhibit based on isClosed
            if (dec == EnumDecorator.CLOSED) 
                decorator = new ClosedEvent(decorator);

                if (dec == EnumDecorator.FEEDING) 
                    decorator = new FeedingEvent(decorator);
                
                if (dec == EnumDecorator.PETTING) 
                    decorator = new CleaningEvent(decorator);
                


            // decorate with event based on event variable

        }
    }
    
}
