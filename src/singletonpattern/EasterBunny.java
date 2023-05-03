/**
 * 
 */
package singletonpattern;

import decoratorpattern.EggDecoratorFactory;
import factorypattern.Egg;
import factorypattern.EggFactory;

/**
 * @author Detelinka Trifonova
 *
 */
// Singleton Pattern
public class EasterBunny {

	private static EasterBunny instance = null;

	private EasterBunny() {

	}

	public static EasterBunny getInstance() {

		if (instance == null) {
			instance = new EasterBunny();
		}
		return instance;
	}

	public Egg createEgg(String type) {

		Egg egg = EggFactory.createEgg(type);
		egg = EggDecoratorFactory.decorateEgg(egg);
		return egg;
	}
}