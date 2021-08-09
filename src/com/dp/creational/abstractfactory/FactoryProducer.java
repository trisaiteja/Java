package com.dp.creational.abstractfactory;

import com.CopyRight;

@CopyRight
public class FactoryProducer {

	private static FactoryProducer instance = new FactoryProducer();

	private FactoryProducer() {
	}

	public static FactoryProducer getInstance() {
		synchronized (instance) {
			if (instance != null) {
				return instance;
			} else {
				return null;
			}
		}
	}

	public AbstractShapeFactory getFactory(String type) {
		if (type.equals("rounded")) {
			return new RoundedShapeFactory();
		} else if (type.equals("shape")) {
			return new ShapeFactory();
		}
		return null;
	}
}
