package org.core.game.menu_item.detail;

import org.core.game.menu_item.Item;

public class Paper extends Item {

	public Paper() {
		super(Item.PAPER);
		this.winTo = Item.ROCK;
		this.loseTo = Item.SCISSOR;
	}

}
