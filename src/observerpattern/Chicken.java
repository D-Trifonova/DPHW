/**
 * 
 */
package observerpattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Observer Pattern
public class Chicken implements Observer {

	@Override
	public void update(int eggsCount) {

		if (eggsCount >= 5) {

			System.out.println("Кокошите яйца са готови " + eggsCount + " пъти!");
		}
	}
}