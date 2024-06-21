package org.core.game.helper.impl;

import org.core.game.helper.OutputDecorator;

public class MenuItemOutputDecorator implements OutputDecorator {

	private String [] menuItemNames;
	
	public MenuItemOutputDecorator(String [] menuItemNames) {
		this.menuItemNames = menuItemNames;
	}
	
	@Override
	public int getMaxLength() {
		int maxLength = 0;
		for (var name : menuItemNames) {
			if (maxLength < name.length()) {
				maxLength = name.length();
			}
		}
		return maxLength;
	}

	@Override
	public String getFormattedString() {
		int maxLength = getMaxLength();
		String formattedString = "%%d-%%%ds".formatted(maxLength+2);
		return formattedString;
	}

}
