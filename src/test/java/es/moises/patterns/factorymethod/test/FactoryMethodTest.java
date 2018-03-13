package es.moises.patterns.factorymethod.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.moises.patterns.factorymethod.AnimalFactoryMethod;
import es.moises.patterns.factorymethod.CatFactoryMethod;
import es.moises.patterns.factorymethod.DogFactoryMethod;
import es.moises.patterns.factorymethod.model.Animal.Sound;

public class FactoryMethodTest {
	
	private AnimalFactoryMethod dogFactoryMethod;
	private AnimalFactoryMethod catFactoryMethod;
	
	@Before
	public void before() {
		dogFactoryMethod = new DogFactoryMethod();
		catFactoryMethod = new CatFactoryMethod();
	}
	
	@Test
	public void test() {
		assertEquals(dogFactoryMethod.makeSound(), Sound.BARK);
		assertEquals(catFactoryMethod.makeSound(), Sound.MEOW);
	}
	
}
