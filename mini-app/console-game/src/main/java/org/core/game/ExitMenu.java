package org.core.game;

import org.core.game.helper.Output;

public class ExitMenu extends MenuItem {

	public ExitMenu(int id) {
		super(id, "Exit");
	}

	@Override
	public void play() {
		System.out.println();
		Output.showMessage("Good Bye");
	}

}
