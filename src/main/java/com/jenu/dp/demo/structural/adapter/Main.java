package com.jenu.dp.demo.structural.adapter;

public class Main {

	/**
	 * The main method.
	 * 
	 * 
	 * 
	 * Adapter Pattern.
	 * 
	 * 
	 * 
	 * Adapter pattern is a structural pattern. It is used to provide a bridge
	 * for incompatible interfaces. This helps to reuse an old interface, which
	 * is incompatible with a modern interface.
	 * 
	 * The Adapter {@link LegacyRectangleAdapter}} Class holds an HAS-A
	 * relationship with the adaptee {@link LegacyRectangle}} class. Hence this
	 * kind of Adapter implementation is called Object-Adapter implementation.
	 *
	 * In this scenario, a modern {@link Rectangle} interface is there, which
	 * helps to draw rectangles, on providing co-ordinates of two opposite
	 * vertices. There is already an implementation for Rectangle
	 * {@link LegacyRectangle}, that helps to draw rectangle, on providing a
	 * starting co-ordinate and required width and height. Here we bridge the
	 * new {@link Rectangle} interface and legacy {@link LegacyRectangle}
	 * interface via {@link LegacyRectangleAdapter}.
	 *
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		final Rectangle rectangle = new LegacyRectangleAdapter(new LegacyRectangleImpl());
		draw(rectangle);
	}

	public static void draw(Rectangle rectangle) {
		rectangle.drawRectangle(0, 5, 10, 0);
	}

}
