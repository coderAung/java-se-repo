package org.core.game.helper.impl;

import java.util.Scanner;

import org.core.game.helper.UserInput;

public class UserInputImpl implements UserInput {
	
	private static Scanner scanner;
	
	public UserInputImpl() {
		scanner = new Scanner(System.in);
	}
	
	@Override
	public int getIntInput() {
		int i = Integer.parseInt(scanner.nextLine());
		return i;
	}

	@Override
	public String getStringInput() {
		return scanner.nextLine();
	}
	
}
