package org.core.test;

import org.core.game.ConsoleGame;
import org.core.game.MenuItem;
import org.core.game.helper.Output;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = OrderAnnotation.class)
public class SimpleTest {
	
	@Order(1)
	@Test
	void test1() {
		Output.showMessage("Welcom To Test");
		Output.showAlert("Wrong input");
	}
	
	@Order(2)
	@Test
	void test2() {
		MenuItem [] menuItems = {
				new SampleMenuItem(1),
				new SampleMenuItem(2),
				new SampleMenuItem(3)
		};
		new ConsoleGame("Test", menuItems).start();
	}
		
}

class SampleMenuItem extends MenuItem {

	public SampleMenuItem(int id) {
		super(id, "Item %d".formatted(id));
	}

	@Override
	public void play() {
		System.out.println(getName().concat("is playing"));
	}
	
}
