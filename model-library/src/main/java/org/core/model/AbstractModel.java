package org.core.model;

import org.core.database.DatabaseManager;

public abstract class AbstractModel<T> implements Model<T> {

	protected DatabaseManager manager;
	
	public AbstractModel(DatabaseManager manager) {
		this.manager = manager;
	}
}
