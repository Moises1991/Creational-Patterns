package es.moises.patterns.abstractfactory.model;

/**
 * Abstract class representing a animal.
 * 
 * @author Moisés Palma Isern
 */
public abstract class Animal {
	
	protected String name;
	
	/**
	 * Getter of the animal name
	 * 
	 * @return The animal name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of the animal name
	 * 
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
