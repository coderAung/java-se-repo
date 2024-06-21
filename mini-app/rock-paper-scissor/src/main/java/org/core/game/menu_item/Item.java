package org.core.game.menu_item;

import org.core.game.menu_item.detail.Paper;
import org.core.game.menu_item.detail.Rock;
import org.core.game.menu_item.detail.Scissor;

public abstract class Item implements ComparableItem {
	
	public static final String ROCK = "ROCK";
	public static final String PAPER = "PAPER";
	public static final String SCISSOR = "SCISSOR";
	
	private String name;
	protected String winTo;
	protected String loseTo;
	
	public String getName() {
		return name;
	}

	public Item(String name) {
		this.name = name;
	}

	enum Result {
			WIN, LOSE, DRAW
	}
	
	@Override
	public Result against(Item item) {
		if (item.getName().equals(winTo)) {
			return Result.WIN;
		}
		if (item.getName().equals(loseTo)) {
			return Result.LOSE;
		}
		return Result.DRAW;
	}
	
	public static Item [] getItems() {
		return new Item [] {
				new Rock(), new Paper(), new Scissor()
		};
	}
	
	public static Item getItemFromString(String itemName) {
		if (itemName.equalsIgnoreCase(ROCK)) {
			return new Rock();
		}
		if (itemName.equalsIgnoreCase(PAPER)) {
			return new Paper();
		}
		if (itemName.equalsIgnoreCase(SCISSOR)) {
			return new Scissor();
		}
		return null;
	}
}
