package es.moises.patterns.factorymethod;

import es.moises.patterns.factorymethod.model.Animal;
import es.moises.patterns.factorymethod.model.Cat;

/**
 * Concrete factory method of an animal/cat
 * 
 * @author Moisés Palma Isern
 */
public class CatFactoryMethod extends AnimalFactoryMethod {
	
	@Override
	protected Animal getAnimal() {
		return new Cat();
	}
	
}
