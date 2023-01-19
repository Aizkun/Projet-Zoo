/**
 * 
 */
package animals;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */
public class Tiger extends Mammal implements Walk{
	private String first_name;
	/**
	 * 
	 */
	public Tiger() {
		// TODO Auto-generated constructor stub
	}
	
	public void wander() {
		System.out.println( this.first_name + " the " + super.name + " wandering.");
	}
}
