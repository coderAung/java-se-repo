package org.core.game;

import org.core.game.menu_item.RockPaperScissor;

public class RockPaperScissorGame {
	
	public static void main(String[] args) {
		MenuItem [] menuItems = {new RockPaperScissor()};
		new ConsoleGame("Rock Paper Scissor", menuItems).start();;
	}
}
