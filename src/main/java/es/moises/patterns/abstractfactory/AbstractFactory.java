package es.moises.patterns.abstractfactory;

import es.moises.patterns.abstractfactory.model.Bird;
import es.moises.patterns.abstractfactory.model.Mammal;

/**
 * Abstract factory used to create mammals and birds.
 * 
 * @author Moisés Palma Isern
 */
public interface AbstractFactory {
	
	/**
	 * Creates a mammal
	 * 
	 * @param race String that defines the kind of mammal to create
	 * @return The mammal created
	 */
	public Mammal createMammal(String race);
	
	/**
	 * Creates a bird
	 * 
	 * @param race String that defines the kind of bird to create
	 * @return The bird created
	 */
	public Bird createBird(String race);
	
}
