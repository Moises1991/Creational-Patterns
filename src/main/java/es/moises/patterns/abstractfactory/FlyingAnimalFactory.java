package es.moises.patterns.abstractfactory;

import es.moises.patterns.abstractfactory.model.*;;

/**
 * Factory to create flying animals.
 * 
 * @author Moisés Palma Isern
 */
public class FlyingAnimalFactory implements AbstractFactory {
	
	/**
	 * Parammeter for 'createBird' method
	 */
	public static final String HAWK = "HAWK";
	/**
	 * Parammeter for 'createMammal' method
	 */
	public static final String BAT = "BAT";
	
	@Override
	public Mammal createMammal(String race) {
		
		switch(race) {
			case BAT:
				return new Bat();
			default:
				return null;
		}
	}

	@Override
	public Bird createBird(String race) {
		
		switch(race) {
			case HAWK:
				return new Hawk();
			default:
				return null;
		}
	}

}
