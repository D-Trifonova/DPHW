/**
 * 
 */
package factorypattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Factory Pattern
public class DinosaurEgg implements Egg {

	@Override
	public void prepare() {

		System.out.println("Приготвяне на динозавърско яйце.");
	}
}