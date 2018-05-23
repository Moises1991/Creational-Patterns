package es.moises.patterns.prototype;

/**
 * Model class Person
 * 
 * @author Moisés Palma Isern
 */
public class Person extends Prototype implements Cloneable {
	
	private String name;
	private String phone;
	
	
	/**
	 * Constructor of Person.
	 * 
	 * @param name Name of the person to construct
	 * @param phone Phone of the person to construct
	 */
	public Person(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	/**
	 * Getter of the name.
	 * 
	 * @return The name to get
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of the name.
	 * 
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter of the phone.
	 * 
	 * @return The phone to get
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * Setter of the phone.
	 * 
	 * @param phone The phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public Person copy() {
		try {
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
