package es.moises.patterns.factorymethod;

import es.moises.patterns.factorymethod.model.Animal;
import es.moises.patterns.factorymethod.model.Dog;

/**
 * Concrete factory method of an animal/dog
 * 
 * @author Moisés Palma Isern
 */
public class DogFactoryMethod extends AnimalFactoryMethod {
	
	@Override
	protected Animal getAnimal() {
		return new Dog();
	}
	
}
