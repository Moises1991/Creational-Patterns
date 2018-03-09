package es.moises.patterns.singleton;

/**
 * Simple implementation of the singleton pattern.
 * 
 * @author Moisés Palma Isern
 */
public class Singleton {
	
	private static Singleton instance;
	
	private long id;
	
	
	private Singleton() {}
	/**
	 * Get a unique instance on the class Singleton.
	 * 
	 * @return A unique instance of Singleton
	 */
	public static Singleton getInstance() {
		if(instance == null) instance = new Singleton();
		return instance;
	}
	
	/**
	 * Getter of id
	 * 
	 * @return Id to get
	 */
	public long getId() {
		return id;
	}
	/**
	 * Setter of id
	 * 
	 * @param id Id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}
