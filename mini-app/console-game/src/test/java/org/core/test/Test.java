package org.core.test;

import org.core.game.ConsoleGame;

public class Test {
	
	@org.junit.jupiter.api.Test
	void test1() {
		var game = new ConsoleGame("Test");
		game.start();
	}
}
