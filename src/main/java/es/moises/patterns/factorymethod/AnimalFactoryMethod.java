package es.moises.patterns.factorymethod;

import es.moises.patterns.factorymethod.model.Animal;

/**
 * Factory method of an animal.
 * 
 * @author Moisés Palma Isern
 */
public abstract class AnimalFactoryMethod {
	
	/**
	 * Gets an animal.
	 * 
	 * @return The concrete animal
	 */
	protected abstract Animal getAnimal();
	
	/**
	 * Gets the sound of a concrete animal.
	 * 
	 * @return The sound of the concrete animal
	 */
	public Animal.Sound makeSound() {
		return getAnimal().makeSound();
	}
	
}
