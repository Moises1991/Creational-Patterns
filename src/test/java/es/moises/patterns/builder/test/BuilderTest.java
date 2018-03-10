package es.moises.patterns.builder.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.Before;
import org.junit.Test;

import es.moises.patterns.builder.Person;

public class BuilderTest {
	
	private Person.Builder builder;
	private Person.Director director;
	
	
	@Before
	public void before() {
		this.builder = Person.createBuilder();
		this.director = Person.createDirector(builder);
	}
	
	@Test
	public void test() {
		
		director.construct(
				"Moisés",
				"Palma Isern",
				LocalDate.of(1991, 9, 12));
		
		Person person = builder.build();
		assertEquals(person.getName(), "Moisés");
		assertEquals(person.getSurname1(), "Palma");
		assertEquals(person.getSurname2(), "Isern");
		assertEquals(person.getBornDate(), LocalDate.of(1991, 9, 12));
		assertEquals(person.getAge(), Period.between(
				LocalDate.of(1991, 9, 12),
				LocalDate.now()).getYears());
	}

}
