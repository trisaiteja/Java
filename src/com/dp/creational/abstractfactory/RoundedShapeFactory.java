package com.dp.creational.abstractfactory;

import com.CopyRight;

@CopyRight
public class RoundedShapeFactory extends AbstractShapeFactory {
	@Override
	public Shape getShape(String type) {
		if (type.equals("Circle")) {
			return new Circle();
		} else if (type.equals("Hexagon")) {
			return new Hexagon();
		}
		return null;
	}
}
