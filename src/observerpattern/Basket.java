/**
 * 
 */
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Detelinka Trifonova
 *
 */
// Observer Pattern
public class Basket {

	private final List<Observer> observers = new ArrayList<>();
	private int eggsCount = 0;

	public void addObserver(Observer observer) {

		observers.add(observer);
	}

	public void removeObserver(Observer observer) {

		observers.remove(observer);
	}

	public void addEgg() { // Egg egg

		eggsCount++;
		notifyObservers();
	}

	private void notifyObservers() {

		for (Observer observer : observers) {

			observer.update(eggsCount);
		}
	}
}