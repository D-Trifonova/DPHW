/**
 * 
 */
package observerpattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Observer Pattern
public class PugPug implements Observer {

	@Override
	public void update(int eggsCount) {

		if (eggsCount >= 5) {

			System.out.println("Падпадъчите яйца са готови " + eggsCount + " пъти!");
		}
	}
}