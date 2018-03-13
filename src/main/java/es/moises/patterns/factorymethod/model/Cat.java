package es.moises.patterns.factorymethod.model;

/**
 * Class that define a cat.
 * 
 * @author Moisés Palma Isern
 */
public class Cat implements Animal {
	
	public Sound makeSound() {
		return Sound.MEOW;
	}
	
}
