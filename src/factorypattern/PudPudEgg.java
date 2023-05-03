/**
 * 
 */
package factorypattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Factory Pattern
public class PudPudEgg implements Egg {

	@Override
	public void prepare() {

		System.out.println("Приготвяне на падпадъче яйце.");
	}
}