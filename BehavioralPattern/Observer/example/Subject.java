import java.util.ArrayList;

abstract class Subject {
	private ArrayList<Observer> observers;
	public Subject() {
		observers = new ArrayList<>();
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	public void notifyObserver(int state) {
		for(Observer o: observers) {
			o.update(state);
		}
	}
}

