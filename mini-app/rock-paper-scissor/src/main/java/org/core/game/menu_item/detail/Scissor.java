package org.core.game.menu_item.detail;

import org.core.game.menu_item.Item;

public class Scissor extends Item {

	public Scissor() {
		super(Item.SCISSOR);
		this.winTo = Item.PAPER;
		this.loseTo = Item.ROCK;
	}
}
