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
public abstract class EggDecorator implements Egg {

	protected Egg egg;

	public EggDecorator(Egg egg) {

		this.egg = egg;
	}

	public abstract void prepare();
}