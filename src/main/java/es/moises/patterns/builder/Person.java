package es.moises.patterns.builder;

import java.time.LocalDate;
import java.time.Period;

/**
 * Person entity.
 * 
 * @author Moisés Palma Isern
 */
public class Person {
	
	private String name;
	private String surname1;
	private String surname2;
	private LocalDate bornDate;
	private int age;
	
	
	/**
	 * Getter of the name.
	 * 
	 * @return The name of the person
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of the name.
	 * 
	 * @param name Name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Getter of the surname1.
	 * 
	 * @return The surname1 of the person
	 */
	public String getSurname1() {
		return surname1;
	}
	/**
	 * Setter of the surname1.
	 * 
	 * @param surname1 Surname1 to set
	 */
	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}
	
	/**
	 * Getter of the surname2.
	 * 
	 * @return The surname2 of the person
	 */
	public String getSurname2() {
		return surname2;
	}
	/**
	 * Setter of the surname2.
	 * 
	 * @param surname2 Surname2 to set
	 */
	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}
	
	/**
	 * Getter of the born date.
	 * 
	 * @return The born date of the person
	 */
	public LocalDate getBornDate() {
		return bornDate;
	}
	/**
	 * Setter of the born date.
	 * 
	 * @param bornDate Born date to set
	 */
	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}
	
	/**
	 * Getter of the age.
	 * 
	 * @return The age of the person
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Setter of age.
	 * 
	 * @param age Age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
	/**
	 * Constructor of the Person.Builder class.
	 * 
	 * @return Builder of a person
	 */
	public static Builder createBuilder() {
		return new Builder();
	}
	
	/**
	 * Builder class of a person (Builder pattern).
	 * 
	 * @author Moisés Palma Isern
	 */
	public static class Builder implements PersonBuilder {
		
		private String name;
		private String surname1;
		private String surname2;
		private LocalDate bornDate;
		private int age;
		
		private Builder() {}
		

		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PersonBuilder surname1(String surname1) {
			this.surname1 = surname1;
			return this;
		}

		public PersonBuilder surname2(String surname2) {
			this.surname2 = surname2;
			return this;
		}

		public PersonBuilder bornDate(LocalDate bornDate) {
			this.bornDate = bornDate;
			return this;
		}

		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		
		/**
		 * Builds a person.
		 * 
		 * @return The person build
		 */
		public Person build() {
			Person person = new Person();
			person.name = this.name;
			person.surname1 = this.surname1;
			person.surname2 = this.surname2;
			person.bornDate = this.bornDate;
			person.age = this.age;
			
			return person;
		}
		
	}
	
	
	/**
	 * Constructor of the Person.Director class.
	 * 
	 * @return Director of a person
	 */
	public static Director createDirector(PersonBuilder builder) {
		return new Director(builder);
	}
	
	/**
	 * Director class of a person (Builder pattern).
	 * 
	 * @author Moisés Palma Isern
	 */
	public static class Director {
		
		private PersonBuilder builder;
		
		private Director(PersonBuilder builder) {
			this.builder = builder;
		}
		
		
		/**
		 * Constructs the values to build a person.
		 * 
		 * @param name Name of the person
		 * @param surname Surnames of the person (separator=' ')
		 * @param bornDate Born names of the person
		 */
		public void construct(
				String name,
				String surname,
				LocalDate bornDate) {
			
			String[] surnames = surname.split(" ");
			int age = Period.between(bornDate, LocalDate.now()).getYears();
			
			builder.
				name(name).
				surname1(surnames[0]).
				surname2(surnames[1]).
				bornDate(bornDate).
				age(age);
		}
		
	}
	
}
