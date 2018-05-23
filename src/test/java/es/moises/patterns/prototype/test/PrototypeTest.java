package es.moises.patterns.prototype.test;

import org.junit.Before;
import org.junit.Test;

import es.moises.patterns.prototype.Person;

import static org.junit.Assert.assertEquals;

public class PrototypeTest {
	
	private Person person0;
	private Person person1;
	
	@Before
	public void before() {
		this.person0 = new Person("Moisés", "123121212");
	}
	
	@Test(expected = org.junit.ComparisonFailure.class)
	public void test() {
		person1 = person0.copy();
		equalsPerson(person0, person1);
		person1.setName("Aron");
		differentPerson(person0, person1);
	}
	
	private void equalsPerson(Person p0, Person p1) {
		assertEquals(p0.getName(), p1.getName());
		assertEquals(p0.getPhone(), p1.getPhone());
	}
	
	private void differentPerson(Person p0, Person p1) {
		assertEquals(p0.getName(), p1.getName());
		assertEquals(p0.getPhone(), p1.getPhone());
	}
	
}
