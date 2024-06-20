package org.core.game;

public class ConsoleGame {
	private String name;
	MenuItem [] menuItems;
	
	public ConsoleGame(String name) {
		this.name = name;
		menuItems = new MenuItem[] {};
	}
	
	public void start() {
		showMessage("Welcome to game");
	}
	
	private void showMessage(String message) {
		var messageLenght = message.length();
		var starLength = messageLenght * 2 + messageLenght;
		for (int i = 0; i < starLength; i ++)  {
			System.out.print("*");
		}
		var formatedMessage = "%n*%%%ds%%%ds%n"
								.formatted(messageLenght * 2 - 1, starLength - (messageLenght*2))
								.formatted(message ,"*");
		System.out.print(formatedMessage);
		for (int i = 0; i < starLength; i ++)  {
			System.out.print("*");
		}
	}
	
	private void showMenu() {
		for(var item : menuItems) {
			System.out.printf("%d %-10s%n", item.getId(), item.getName());
		}
	}
	
	private MenuItem selectMenuItem() {
		return null;
	}
}
