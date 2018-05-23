package es.moises.patterns.prototype;

/**
 * Superclass Prototype with method to clone.
 * 
 * @author Moisés Palma Isern
 */
public abstract class Prototype {
	
	/**
	 * Return a clone of the object.
	 * 
	 * @return The clone of the prototype
	 */
	public abstract Prototype copy();
	
}
