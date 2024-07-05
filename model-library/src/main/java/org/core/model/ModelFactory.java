package org.core.model;

import java.lang.reflect.InvocationTargetException;

import org.core.database.DatabaseManager;

public abstract class ModelFactory {

	private static DatabaseManager manager;
	private static final String MODEL_PACKAGE = "org.core.model.impl.%sModel";

	static {
		manager = DatabaseManager.getInstance();
	}

	private ModelFactory() {
	}

	public static <T> Model<T> getModel(Class<T> c) {

		var fullModelName = MODEL_PACKAGE.formatted(c.getSimpleName());

		try {
			var constructor = Class.forName(fullModelName).getDeclaredConstructor(DatabaseManager.class);
			constructor.setAccessible(true);
			
			@SuppressWarnings("unchecked")
			Model<T> model = (Model<T>) constructor.newInstance(manager);
			
			return model;
			
		} catch (NoSuchMethodException | SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

		return null;
	}

}
