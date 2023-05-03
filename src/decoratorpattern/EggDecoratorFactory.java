/**
 * 
 */
package decoratorpattern;

import factorypattern.Egg;

/**
 * @author Detelinka Trifonova
 *
 */
// Decorator Pattern
public class EggDecoratorFactory {

	public static Egg decorateEgg(Egg egg) {

		// Декорация на случаен принцип.
		if (Math.random() >= 0.51) {
			egg = new ChickenEggDecorator(egg);
		}
		// Оцветяване на случаен принцип.
		if (Math.random() < 0.5) {
			egg = new ColoredEggDecorator(egg);
		}
		return egg;
	}
}