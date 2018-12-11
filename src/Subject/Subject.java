package Subject;

import Observer.Observer;

public interface Subject {

	public String getMessage();
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void checkObservers();
	
}
