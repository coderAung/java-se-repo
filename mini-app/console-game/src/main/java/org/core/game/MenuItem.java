package org.core.game;

public abstract class MenuItem implements Playable {
	private int id;
	private String name;

	public MenuItem(String name) {
		this.id = 0;
		this.name = name;
	}
	
	public MenuItem(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
