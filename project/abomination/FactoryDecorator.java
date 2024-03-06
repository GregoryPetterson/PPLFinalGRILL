package project.abomination;

import java.time.LocalTime;
import project.abomination.Scheduler.EnumDecorator;

public class FactoryDecorator {

    public Exhibit exhibitFactoryDecorator(Events events) {
        // initialize base decorator an exhibit.
        Exhibit exhibit = events.getExhibit();

        // Decorate it accordingly based on what zooAdmin notified us about events.
        for (EventTime eventTime : events.getEventTimes()) {
            EnumDecorator dec = eventTime.getDecorator();
            LocalTime time = eventTime.getTime();
            // Not actually wrapping the exhibit?

            // open or close the exhibit based on isClosed
            if (dec == EnumDecorator.OPEN)
                exhibit = new OpenEvent(exhibit, time);

            if (dec == EnumDecorator.CLOSED)
                exhibit = new ClosedEvent(exhibit, time);

            if (dec == EnumDecorator.FEEDING)
            exhibit = new FeedingEvent(exhibit, time);

            if (dec == EnumDecorator.PETTING)
                exhibit = new PettingEvent(exhibit, time);

        }
        return exhibit;
    
    }
}
