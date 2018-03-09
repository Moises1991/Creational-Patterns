package es.moises.patterns.singleton.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.moises.patterns.singleton.Singleton;

public class SingletonTest {
	
	private Singleton singleton0, singleton1;
	
	
	@Before
	public void before() {
		singleton0 = Singleton.getInstance();
		singleton1 = Singleton.getInstance();
	}
	
	@Test
	public void test() {
		singleton0.setId(0);
		singleton1.setId(1);
		
		assertEquals(singleton0.getId(), singleton1.getId());
	}
	
}
