/**
 * 
 */
package observerpattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Observer Pattern
public class Dinosaur implements Observer {

	@Override
	public void update(int eggsCount) {

		if (eggsCount >= 5) {

			System.out.println("Дикозавърските яйца са готови " + eggsCount + " пъти!");
		}
	}
}