package org.core.game.menu_item.detail;

import org.core.game.menu_item.Item;

public class Rock extends Item {
	
	public Rock() {
		super("Rock");
	}

	@Override
	public Result against(Item item) {

		return null;
	}

}
