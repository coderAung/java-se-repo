package org.core.game.menu_item.detail;

import org.core.game.menu_item.Item;

public class Rock extends Item {
	
	public Rock() {
		super(Item.ROCK);
		this.winTo = Item.SCISSOR;
		this.loseTo = Item.PAPER;
	}


}
