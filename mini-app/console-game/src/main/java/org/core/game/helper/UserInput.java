package org.core.game.helper;

import org.core.game.helper.impl.UserInputImpl;

public interface UserInput {

	int getIntInput();

	String getStringInput();

	static UserInput getInstance() {
		return new UserInputImpl();
	}
}
