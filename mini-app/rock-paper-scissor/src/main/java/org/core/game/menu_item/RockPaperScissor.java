package org.core.game.menu_item;

import java.util.Random;

import org.core.game.MenuItem;
import org.core.game.helper.Output;
import org.core.game.helper.RandomNumberGenerator;
import org.core.game.helper.UserInput;
import org.core.game.menu_item.Item.Result;

public class RockPaperScissor extends MenuItem {
	
	private Item [] items;
	private UserInput userInput;
	private RandomNumberGenerator numberGenerator;

	public RockPaperScissor() {
		super(0, "Rock Paper Scissor Game");
		this.items = Item.getItems();
		userInput = UserInput.getInstance();
		numberGenerator = RandomNumberGenerator.getInstance(new Random());
	}
	
	private Item generateRandomItem() {
		int index = numberGenerator.getRandom(items.length);		
		return items[index];
	}
	
	private Item getUserInputItem() {
		Output.askForInput("Enter One Item (Rock, Paper, Scissor)");
		var inputString = userInput.getStringInput();
		var userInputItem = Item.getItemFromString(inputString);
		
		return userInputItem;
	}
	
	private void showResult(Result result) {
		System.out.println();
		Output.showMessage("YOU ".concat(result.name()));
		System.out.println();
	}

	@Override
	public void play() {
		Item userInputItem = getUserInputItem();
		if (null == userInputItem) {
			Output.showAlert("Invalid Input");
		} else {
			Item computerGenerateItem = generateRandomItem();
			Result result = userInputItem.against(computerGenerateItem);
			showSelectedItem(userInputItem, computerGenerateItem);
			showResult(result);
		}
	}

	private void showSelectedItem(Item userInputItem, Item computerGenerateItem) {
		
		var messageForUserSelectedItem = "You Selected";
		
		var messageForComputerSelectedItem = "Computer Selected";
		
		int limit = messageForUserSelectedItem.length() > messageForComputerSelectedItem.length() ?
				messageForUserSelectedItem.length() : messageForComputerSelectedItem.length();
		
		Output.showSimpleMessage(messageForUserSelectedItem, limit, userInputItem.getName());
		Output.showSimpleMessage(messageForComputerSelectedItem, limit, computerGenerateItem.getName());
	}
}
