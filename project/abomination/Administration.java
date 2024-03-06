package project.abomination;

import java.util.*;

public class Administration {

    protected FactoryDecorator factory;
    private ArrayList<Event> events;
    public enum EnumDecorator {FEEDING, OPEN, PETTING, CLOSED}

    public Administration(){
      Lion.getInstance();
      Tiger.getInstance();
      Bear.getInstance();
      // Ensuring each singleton is initialized.

      // Initialize factory. It's done here since there are no plans
      // of adding other factory types.
      this.factory = new FactoryDecorator();

      events = new ArrayList<Event>();
      // The arraylist of event objects.
      // Each Event object knows what exhibit it's for.
    }

    public void notifyFactory() {
		factory.exhibitFactoryDecorator(events);
	}



    
}
