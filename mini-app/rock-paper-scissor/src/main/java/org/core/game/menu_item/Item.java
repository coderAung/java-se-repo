package org.core.game.menu_item;

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

	public void setName(String name) {
		this.name = name;
	}

	public Item(String name) {
		this.name = name;
	}

	protected enum Result {
			WIN, LOSE, DRAW
	}
}
