package com.jenu.dp.demo.creational.abstractfactory;

public class HyundaiFactory extends AbstractBrandFactory {

	private HyundaiFactory() {

	}

	public static HyundaiFactory getInstance() {
		return SingletonHelper.getInstance();
	}

	@Override
	public HatchBack getHatch() {
		return new Hyundai_I20();
	}

	@Override
	public Sedan getSedan() {
		return new Hyundai_Verna();
	}

	@Override
	public SUV getSuv() {
		return new Hyundai_Creta();
	}

	private static class SingletonHelper {

		private static final HyundaiFactory FACTORY_INSTANCE = new HyundaiFactory();

		private SingletonHelper() {

		}

		private static HyundaiFactory getInstance() {
			return SingletonHelper.FACTORY_INSTANCE;
		}
	}

}
