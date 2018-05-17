package com.jenu.dp.demo.structural.adapter;

public class LegacyRectangleImpl implements LegacyRectangle {

	@Override
	public void drawRectangle(int x1, int y1, int width, int height) {
		System.out.format("Drawing rectangle having with starting points [%s,%s], having width [%s] and height [%s]",
				x1, y1, width, height);

	}

}
