/**
 * 
 */
package factorypattern;

/**
 * @author Detelinka Trifonova
 *
 */
// Factory Pattern
public class EggFactory {

	public static Egg createEgg(String type) {

		switch (type) {
		case "pudpud":
			return new PudPudEgg();
		case "dinosaur":
			return new DinosaurEgg();
		case "chicken":
			return new ChickenEgg();
		default:
			throw new IllegalArgumentException("Невалиден тип яйце: " + type);
		}
	}
}