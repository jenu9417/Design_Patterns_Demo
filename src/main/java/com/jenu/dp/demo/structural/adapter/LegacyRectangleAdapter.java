package com.jenu.dp.demo.structural.adapter;

public class LegacyRectangleAdapter implements Rectangle {

	private LegacyRectangle legacyRectangle;

	/**
	 * Private constructor to avoid object instantiation without LegacyRectangle
	 * instance.
	 */
	private LegacyRectangleAdapter() {

	}

	public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
		this();
		this.legacyRectangle = legacyRectangle;
	}

	@Override
	public void drawRectangle(int x1, int y1, int x2, int y2) {
		final int x = Math.min(x1, x2);
		final int y = Math.min(y1, y2);

		final int width = Math.abs(x1 - x2);
		final int height = Math.abs(y1 - y2);

		legacyRectangle.drawRectangle(x, y, width, height);
	}

}
