package com.dp.creational.abstractfactory;

import com.CopyRight;

@CopyRight
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		AbstractShapeFactory factory = FactoryProducer.getInstance().getFactory("rounded");
		Shape shape = factory.getShape("Hexagon");
		shape.draw();
	}

}
