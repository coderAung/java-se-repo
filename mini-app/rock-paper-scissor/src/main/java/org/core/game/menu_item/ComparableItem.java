package org.core.game.menu_item;

import org.core.game.menu_item.Item.Result;

public interface ComparableItem {
	Result against(Item item);
}
