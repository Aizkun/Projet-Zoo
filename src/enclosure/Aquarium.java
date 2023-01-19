/**
 * 
 */
package enclosure;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */

import animals.Animal;
import animals.Fish;

import java.utils.ArrayList;

public class Aquarium <T extends Fish> extends Enclosure {
    private int depth;
    private String cleanlinessWater; // 1 = propre / 2 = état moyen / 3 = sale

    public Aquarium(String name, int surface, int maxNbAnimal, int depth) {
        super(name, surface, maxNbAnimal);
        this.depth = depth;
        this.cleanlinessWater = Propre;
    }
}