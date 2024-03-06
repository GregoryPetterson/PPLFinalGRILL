package project.abomination;

import java.util.*;

import headfirst.designpatterns.observer.weather.TempHumPressObserver;

import java.time.LocalTime; 

public class Administration {

    private List<Event> events;
    public enum EnumExhibit {LION, TIGER, BEAR}
    public enum EnumDecorator {FEEDING, OPEN, PETTING, CLOSED}

    public Administration(){
      Lion.getInstance();
      Tiger.getInstance();
      Bear.getInstance();
      // Need to initialize each singleton.

      events = new ArrayList<Event>();
      // The arraylist of event objects.
      // Each Event object knows what exhibit it's for.
    }

    public void registerObserver(Exhibit o) {
		observers.add(o);
	}

    public void notifyObservers() {
		for (Event event : events) {
			event.update(decList);
		}
	}



    
}
