package com.jenu.dp.demo.creational.abstractfactory;

public class VWFactory extends AbstractBrandFactory {

	private VWFactory() {

	}

	public static VWFactory getInstance() {
		return SingletonHelper.getInstance();
	}

	@Override
	public HatchBack getHatch() {
		return new VW_Polo();
	}

	@Override
	public Sedan getSedan() {
		return new VW_Vento();
	}

	@Override
	public SUV getSuv() {
		return new VW_Tiguan();
	}

	private static class SingletonHelper {

		private static final VWFactory FACTORY_INSTANCE = new VWFactory();

		private SingletonHelper() {

		}

		private static VWFactory getInstance() {
			return SingletonHelper.FACTORY_INSTANCE;
		}
	}

}
