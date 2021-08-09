package com.dp.creational.abstractfactory;

import com.CopyRight;

@CopyRight
public class ShapeFactory extends AbstractShapeFactory {
	
	@Override
	public Shape getShape(String type) {
		if (type.equals("Square")) {
			return new Square();
		} else if (type.equals("Rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
