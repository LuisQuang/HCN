package com.aqt.tthvhcn.dinh;

public class Dinh {
	private double x, y;

	public Dinh(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public void inTT() {

		System.out.println("(x,y) = " + x + "," + y);
	}

	public double getX() {
		// Kiểm tra bảo mật
		return x;
	}

	public double getY() {
		// Kiểm tra bảo mật
		return y;
	}

	public void setX(double x) {
		this.x = x;
		// Xây dựng phương thức set
	}

	public void setY(double y) {
		this.y = y;
	}
}
