/**
 * 
 */
package animals;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */
public class Wolf extends Mammal implements Walk{
	private String first_name;  
	/**
	 * 
	 */
	public Wolf() {
		// TODO Auto-generated constructor stub
	}

	public void wander() {
		System.out.println( this.first_name + " the " + super.name + " wandering.");
	}
}
