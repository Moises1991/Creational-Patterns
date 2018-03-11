package es.moises.patterns.abstractfactory.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.moises.patterns.abstractfactory.AbstractFactory;
import es.moises.patterns.abstractfactory.FactoryProducer;
import es.moises.patterns.abstractfactory.FlyingAnimalFactory;
import es.moises.patterns.abstractfactory.WalkingAnimalFactory;
import es.moises.patterns.abstractfactory.model.Bat;
import es.moises.patterns.abstractfactory.model.Dog;
import es.moises.patterns.abstractfactory.model.Hawk;
import es.moises.patterns.abstractfactory.model.Penguin;

public class AbstractFactoryTest {
	
	public AbstractFactory walkingAnimalFactory;
	public AbstractFactory flyingAnimalFactory;
	
	@Before
	public void Before() {
		walkingAnimalFactory = FactoryProducer.createFactory(FactoryProducer.WALKING);
		flyingAnimalFactory = FactoryProducer.createFactory(FactoryProducer.FLYING);
	}
	
	@Test
	public void test() {
		assertTrue(walkingAnimalFactory.createMammal(WalkingAnimalFactory.DOG) instanceof Dog);
		assertTrue(walkingAnimalFactory.createBird(WalkingAnimalFactory.PENGUIN) instanceof Penguin);
		assertTrue(flyingAnimalFactory.createMammal(FlyingAnimalFactory.BAT) instanceof Bat);
		assertTrue(flyingAnimalFactory.createBird(FlyingAnimalFactory.HAWK) instanceof Hawk);
	}
	
}
