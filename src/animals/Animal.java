/**
 * 
 */
package animals;

/**
 * @author Florian NEGRE et Maxime TAN
 *
 */
public class Animal {
	protected String name;
	protected boolean sexe; //False = female and true = male
	protected float weight;
	protected float size;
	protected float age; 
	protected boolean hunger; //False = not hungry and...
	protected boolean sleep; //False = not sleeping and... 
	protected boolean health; //False not good...
	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public void eat() {
		if(this.hunger) {
			this.hunger = false;
		}
	}
	
	public void emitSound() {
		System.out.println("The " + this.name + "emit a sound");
	}
	
	public void heal() {
		if(this.health) {
			this.health = true;
		}
	}
	
	public void fallAsleep() {
		if(!this.sleep) {
			this.sleep = true;
		}
	}
	
	public void wakeUp() {
		if(this.sleep) {
			this.sleep = false;
		}
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public boolean isHunger() {
		return hunger;
	}

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}

	public boolean isSleep() {
		return sleep;
	}

	public void setSleep(boolean sleep) {
		this.sleep = sleep;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", sexe=" + sexe + ", weight=" + weight + ", size=" + size + ", age=" + age
				+ ", hunger=" + hunger + ", sleep=" + sleep + ", health=" + health + "]";
	}
}
