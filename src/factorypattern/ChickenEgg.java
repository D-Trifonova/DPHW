/**
 * 
 */
package factorypattern;

/**
 * @author Detelinka Trifonova
 *
 */
//Factory Pattern
public class ChickenEgg implements Egg {

	@Override
	public void prepare() {

		System.out.println("Приготвяне на кокоше яйце.");
	}
}