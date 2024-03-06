package project.abomination;

import java.util.*;

public class Scheduler {

    protected FactoryDecorator factory;
    private Events events;
    public enum EnumDecorator {FEEDING, TRAINING, OPEN, PETTING, CLOSED}

    public Scheduler(Events events){
      Lion.getInstance();
      Tiger.getInstance();
      Bear.getInstance();
      // Ensuring each singleton is initialized.

      // Initialize factory. It's done here since there are no plans
      // of adding other factory types.
      this.factory = new FactoryDecorator();

      this.events = events;
      // The arraylist of event objects.
      // Each Event object knows what exhibit it's for.
    }

    public  Exhibit notifyFactory() {
		return factory.exhibitFactoryDecorator(events);
	}



    
}
