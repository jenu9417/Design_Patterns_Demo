package com.jenu.dp.demo.creational.abstractfactory;

public interface HatchBack extends Drivable {

	default void activateClimateControl() {
		System.out.println("Climate Control Activated!!");
	}

}
