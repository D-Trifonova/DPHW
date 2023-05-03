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
public class ChickenEggDecorator extends EggDecorator {

	public ChickenEggDecorator(Egg egg) {

		super(egg);
	}

	@Override
	public void prepare() {

		egg.prepare();
		System.out.println("Декориране на яйцето.");
	}
}