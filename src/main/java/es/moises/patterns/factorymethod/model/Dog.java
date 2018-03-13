package es.moises.patterns.factorymethod.model;

/**
 * Class that define a dog.
 * 
 * @author Moisés Palma Isern
 */
public class Dog implements Animal {

	public Sound makeSound() {
		return Sound.BARK;
	}

}
