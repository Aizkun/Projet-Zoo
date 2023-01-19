/**
 * 
 */
package enclosure;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */

import animals.Animal;
import animals.Fly;

import java.utils.ArrayList;

public class Aviary <T extends Fly> extends Enclosure {
    private int height;


    public Aviary(String name, float surface, int maxNbAnimals, int height) {
        super(name, surface, maxNbAnimals);
        this.height = height;
    }
}