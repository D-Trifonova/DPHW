/**
 * 
 */
package app;

import factorypattern.Egg;
import observerpattern.Basket;
import observerpattern.Chicken;
import observerpattern.Dinosaur;
import observerpattern.PugPug;
import singletonpattern.EasterBunny;

/**
 * @author: Detelinka Trifonova @F.N.: 2001261021
 * @specialty: Computer Science
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EasterBunny easterBunny = EasterBunny.getInstance();
		Basket basket = new Basket();

		basket.addObserver(new Chicken());
		basket.addObserver(new PugPug());
		basket.addObserver(new Dinosaur());

		// Създаване на кокошко яйце
		Egg chickEgg = easterBunny.createEgg("chicken");
		// Създаване на падпадъче яйце
		Egg pudEgg = easterBunny.createEgg("pudpud");
		// Създаване на динозавърско яйце
		Egg dinoEgg = easterBunny.createEgg("dinosaur");

		// Създаване на яйца и декориране/оцветяването им.
		chickEgg.prepare();
		pudEgg.prepare();
		dinoEgg.prepare();

		System.out.println();

		for (int i = 0; i < 9; i++) { // Вече готови яйца.

			basket.addEgg();
		}
	}

	// TODO end
}