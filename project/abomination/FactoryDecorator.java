package project.abomination;

import java.util.ArrayList;
import java.time.LocalTime;
import project.abomination.Administration.EnumDecorator;

public class FactoryDecorator {

    public void exhibitFactoryDecorator(ArrayList<Event> events) {
        // initialize base decorator an exhibit.

        // Decorate it accordingly based on what zooAdmin notified us about events.

        for (Event event : events) {
            Exhibit decorator = event.getExhibit();
            EnumDecorator dec = event.getDecorator();
            LocalTime time = event.getTime();

            // open or close the exhibit based on isClosed
            if (dec == EnumDecorator.CLOSED)
                decorator = new ClosedEvent(decorator, time);

            if (dec == EnumDecorator.FEEDING)
                decorator = new FeedingEvent(decorator, time);

            if (dec == EnumDecorator.PETTING)
                decorator = new PettingEvent(decorator, time);

            if (dec == EnumDecorator.CLOSED)
                decorator = new PettingEvent(decorator, time);
        }
    }
}
