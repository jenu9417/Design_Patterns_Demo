package com.jenu.dp.demo.creational.abstractfactory;

public interface Sedan extends Drivable {

	default void openBootLid() {
		System.out.println("Boot Lid Opened!!");
	}

}
