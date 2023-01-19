/**
 * 
 */
package enclosure;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */
public class Enclosure {
	protected String name;
	protected float surface;
	protected int maxNbAnimals;
	protected int currentNbAnimals;
	protected String currentAnimals;
	protected String cleanliness;
	/**
	 * 
	 */
	public Enclosure() {
		// TODO Auto-generated constructor stub
	}
	
	public void characteristics() {
		for (i=0; i<currentNbAnimals;i++) {
			toString();
			System.out.println();
		}
		System.out.println("The surface of the zoo is " + this.surface + "and");
	}
}
