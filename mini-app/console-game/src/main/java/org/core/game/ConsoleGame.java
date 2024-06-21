package org.core.game;

import java.util.Arrays;

import org.core.game.helper.Output;
import org.core.game.helper.UserInput;

public class ConsoleGame {
	private String name;
	private MenuItem [] menuItems;
	private UserInput userInput;
	
	public ConsoleGame(String name, MenuItem [] menuItems) {
		this.name = name;
		this.menuItems = Arrays.copyOf(menuItems, menuItems.length + 1);
		this.menuItems[this.menuItems.length - 1] = new ExitMenu(this.menuItems.length);
		userInput = UserInput.getInstance();
	}
	
	public void start() {
		showMessage("Welcome to %s".formatted(name));

		while (true) {
			showMenu();
			var selectedMenuItem = selectMenuItem();
			
			if (null == selectedMenuItem) {
				showAlert("Wrong Input");
				continue;
			} else if (selectedMenuItem instanceof ExitMenu exitMenu) {
				exitMenu.play();
				break;
			}
			selectedMenuItem.play();	
		}
	}
	
	private void showAlert(String message) {
		Output.showAlert(message);
	}

	private void showMessage(String message) {
		Output.showMessage(message);
	}
	
	private void showMenu() {
		Output.showMenuItems(getMenuItemsName());
	}
	
	private String [] getMenuItemsName() {
		String [] menuItemNames = new String [menuItems.length];
		for (int i = 0; i < menuItems.length; i ++) {
			menuItemNames[i] = menuItems[i].getName();
		}
		return menuItemNames;
	}
	
	private MenuItem selectMenuItem() {
		int id = askForMenuItem("Select Menu Item");
		if (id > menuItems.length || id < 0) {
			return null;
		}
		return menuItems[id - 1];
	}
	
	private int askForMenuItem(String message) {
		Output.askForInput(message);
		return userInput.getIntInput();
	}
}
