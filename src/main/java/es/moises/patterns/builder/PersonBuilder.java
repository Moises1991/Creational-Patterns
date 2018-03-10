package es.moises.patterns.builder;

import java.time.LocalDate;

/**
 * Inrerface that defines a person builder.
 * 
 * @author Moisés Palma Isern
 */
public interface PersonBuilder {
	
	/**
	 * Builds the person name.
	 * 
	 * @param name Name of the person
	 * @return The person builder
	 */
	public PersonBuilder name(String name);
	
	/**
	 * Builds the person first surname.
	 * 
	 * @param surname1 First surname of the person
	 * @return The person builder
	 */
	public PersonBuilder surname1(String surname1);
	
	/**
	 * Builds the person second surname.
	 * 
	 * @param surname2 Second surname of the person
	 * @return The person builder
	 */
	public PersonBuilder surname2(String surname2);
	
	/**
	 * Builds the person born date.
	 * 
	 * @param bornDate Born date of the person
	 * @return The person builder
	 */
	public PersonBuilder bornDate(LocalDate bornDate);
	
	/**
	 * Builds the person age.
	 * 
	 * @param age Age of the person
	 * @return The person builder
	 */
	public PersonBuilder age(int age);
	
}
