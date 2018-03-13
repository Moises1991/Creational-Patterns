package es.moises.patterns.factorymethod.model;

/**
 * Class that define an animal.
 * 
 * @author Moisés Palma Isern
 */
public interface Animal {
	
	/**
	 * Possibles sounds that an animal can make.
	 * 
	 * @author Moisés Palma Isern
	 */
	public enum Sound {
		BARK,
		MEOW;
	}
	
	/**
	 * Gets the sound that the animal makes.
	 * 
	 * @return The sound of the animal
	 */
	public Sound makeSound();
	
}
