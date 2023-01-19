/**
 * 
 */
package animals;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */
public class Mammal extends Animal{

	/**
	 * 
	 */
	public Mammal() {
		// TODO Auto-generated constructor stub
	}
	
	public void giveBirth() {
		if (!super.sexe) {
			System.out.println("The" + super.name + "gave birth");
		}
	}
}
