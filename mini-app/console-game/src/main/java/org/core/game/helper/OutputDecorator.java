package org.core.game.helper;

import org.core.game.helper.impl.MenuItemOutputDecorator;

public interface OutputDecorator {
	int getMaxLength();

	String getFormattedString();

	public static OutputDecorator getMenuItemOutputDecorator(String[] menuItemNames) {
		return new MenuItemOutputDecorator(menuItemNames);
	}
}
