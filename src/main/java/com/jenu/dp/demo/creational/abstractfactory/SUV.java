package com.jenu.dp.demo.creational.abstractfactory;

public interface SUV extends Drivable {

	default void activateTractionControl() {
		System.out.println("Traction Control Activated!!");
	}

}
