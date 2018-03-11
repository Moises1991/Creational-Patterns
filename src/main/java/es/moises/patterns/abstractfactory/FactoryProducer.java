package es.moises.patterns.abstractfactory;

/**
 * Factory used to create abstract factories.
 * 
 * @author Moisés Palma Isern
 */
public class FactoryProducer {
	
	/**
	 * Parammeter for 'createFactory' method
	 */
	public static final String WALKING = "WALKING";
	/**
	 * Parammeter for 'createFactory' method
	 */
	public static final String FLYING = "FLYING";
	
	/**
	 * Creates a abstract factory
	 * 
	 * @param factory_type String that defines the kind of factory to create
	 * @return The created factory
	 */
	public static AbstractFactory createFactory(String factory_type) {
		
		switch(factory_type) {
			case WALKING:
				return new WalkingAnimalFactory();
			case FLYING:
				return new FlyingAnimalFactory();
			default:
				return null;
		}
	}
	
}
