package es.moises.patterns.abstractfactory;

import es.moises.patterns.abstractfactory.model.*;

/**
 * Factory to create walking animals.
 * 
 * @author Moisés Palma Isern
 */
public class WalkingAnimalFactory implements AbstractFactory {
	
	/**
	 * Parammeter for 'createMammal' method
	 */
	public static final String DOG = "DOG";
	/**
	 * Parammeter for 'createBird' method
	 */
	public static final String PENGUIN = "PENGUIN";

	@Override
	public Mammal createMammal(String race) {
		
		switch(race) {
			case DOG:
				return new Dog();
			default:
				return null;
		}
	}

	@Override
	public Bird createBird(String race) {
		
		switch(race) {
			case PENGUIN:
				return new Penguin();
			default:
				return null;
		}
	}

}
