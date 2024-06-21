package org.core.game.helper;

public class Output {

	private Output() {
	}

	public static void showMessage(String message) {
		var messageLenght = message.length();
		var starLength = messageLenght * 2 + messageLenght;
		for (int i = 0; i < starLength; i++) {
			System.out.print("*");
		}
		var formatedMessage = "%n*%%%ds%%%ds%n".formatted(messageLenght * 2 - 1, starLength - (messageLenght * 2))
				.formatted(message, "*");
		System.out.print(formatedMessage);
		for (int i = 0; i < starLength; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void askForInput(String message) {
		System.out.printf("%15s : ", message);
	}

	public static void showAlert(String message) {
		System.out.printf(">>> %s <<<", message);
		System.out.println();
	}

	public static void showMenuItems(String[] menuItemsNames) {
		var decorator = OutputDecorator.getMenuItemOutputDecorator(menuItemsNames);
		var formattedString = decorator.getFormattedString();

		for(int i = 0; i < menuItemsNames.length; i ++) {
			System.out.println(formattedString.formatted(i+1, menuItemsNames[i]));			
		}
	}

	public static void showSimpleMessage(String message1, int limit, String message2) {
		var formattedString = "%%%ds : %%s".formatted(limit).formatted(message1, message2);
		System.out.println(formattedString);
	}
	
}
