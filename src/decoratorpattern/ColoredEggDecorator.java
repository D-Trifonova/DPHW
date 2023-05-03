/**
 * 
 */
package decoratorpattern;

import factorypattern.Egg;

/**
 * @author Detelinka Trifonova
 *
 */
public class ColoredEggDecorator extends EggDecorator {

	public ColoredEggDecorator(Egg egg) {

		super(egg);
	}

	@Override
	public void prepare() {

		egg.prepare();
		System.out.println("Оцветяване на яйцето.");
	}
}