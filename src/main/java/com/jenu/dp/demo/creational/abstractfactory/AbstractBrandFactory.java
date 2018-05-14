package com.jenu.dp.demo.creational.abstractfactory;

public abstract class AbstractBrandFactory {

	public abstract HatchBack getHatch();

	public abstract Sedan getSedan();

	public abstract SUV getSuv();

	static AbstractBrandFactory getFactory(String brand) {
		final AbstractBrandFactory factory;

		switch (brand) {
		case "HYUNDAI":
			factory = HyundaiFactory.getInstance();
			break;
		case "VW":
			factory = VWFactory.getInstance();
			break;
		default:
			System.err.println("Invalid Brand!!");
			factory = null;
			break;
		}

		return factory;
	}

}
