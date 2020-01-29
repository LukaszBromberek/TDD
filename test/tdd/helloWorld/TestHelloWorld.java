package tdd.helloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHelloWorld {

	@Test
	void equalsTest() {
		assertEquals("Hello World", HelloWorld.hello());
	}
	
	@Test
	void notEqualsTest() {
		assertFalse(HelloWorld.hello().equals("HelloWorld"));
	}

}
