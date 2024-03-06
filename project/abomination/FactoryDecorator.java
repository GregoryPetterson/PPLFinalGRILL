package project.abomination;

import java.util.ArrayList;
import java.time.LocalTime;
import project.abomination.Scheduler.EnumDecorator;

public class FactoryDecorator {

    public void exhibitFactoryDecorator(ArrayList<Events> events) {
        // initialize base decorator an exhibit.

        // Decorate it accordingly based on what zooAdmin notified us about events.
        ArrayList<Exhibit> decoratedExhibits = new ArrayList<Exhibit>();
        for (Events event : events) {
            Exhibit decorator = event.getExhibit();
            EnumDecorator dec = event.getDecorator();
            LocalTime time = event.getTime();
            // Not actually wrapping the exhibit?

            // open or close the exhibit based on isClosed
            if (dec == EnumDecorator.OPEN)
                decorator = new OpenEvent(decorator.getExhibit(), time);

            if (dec == EnumDecorator.CLOSED)
                decorator = new ClosedEvent(decorator.getExhibit(), time);

            if (dec == EnumDecorator.FEEDING)
            decorator = new FeedingEvent(decorator.getExhibit(), time);

            if (dec == EnumDecorator.PETTING)
                decorator = new PettingEvent(decorator.getExhibit(), time);

            // decoratedExhibits.add(decorator);
            // System.out.println(decoratedExhibits);

        }
    }
}
