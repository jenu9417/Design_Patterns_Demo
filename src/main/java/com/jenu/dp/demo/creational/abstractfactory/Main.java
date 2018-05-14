package com.jenu.dp.demo.creational.abstractfactory;

public class Main {

	/**
	 * The main method.
	 * 
	 * ---------Abstract Factory Pattern------------
	 * 
	 * 
	 * Abstract Factory Pattern is a creational design pattern, used for
	 * controlling class creation.
	 * 
	 * It is used for providing a basic level of abstraction for creating
	 * classes that belong to the same family. A super factory is used for
	 * creating individual family factory, which can then be used for creating
	 * end level classes. Hence, the client is unaware of the concrete
	 * implementation. This provides flexibility in changing the family of
	 * classes, as they will be mentioned, only once, during factory creation.
	 * 
	 * 
	 * 
	 * CheckList:
	 * 
	 * 1) Decide if "platform independence" and creation services are the
	 * current source of pain.
	 * 
	 * 2) Map out a matrix of "platforms" versus "products".
	 * 
	 * 3) Define a factory interface that consists of a factory method per
	 * product.
	 * 
	 * 4) Define a factory derived class for each platform that encapsulates all
	 * references to the new operator.
	 * 
	 * 5) The client should retire all references to new, and use the factory
	 * methods to create the product objects.
	 *
	 *
	 *
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		final AbstractBrandFactory hyundaiFactory = AbstractBrandFactory.getFactory("HYUNDAI");
		final SUV suv1 = hyundaiFactory.getSuv();
		suv1.activateTractionControl();
		suv1.drive();

		final AbstractBrandFactory vwFactory = AbstractBrandFactory.getFactory("VW");
		final HatchBack hatch1 = vwFactory.getHatch();
		hatch1.activateClimateControl();
		hatch1.drive();
	}

}
