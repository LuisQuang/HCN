package com.aql.findgdclcm.find;

public class UCLNBCNN {
	private int a, b;

	public UCLNBCNN(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void timUCLN() {
		if (a == 0 || b == 0) {
			System.out.print("Nhap khong hop le!!!");
		} else {
			int min = a < b ? a : b;
			int ucln = 1;
			while (min > 0) {
				if (a % min == 0 && b % min == 0) {
					ucln = min;
					break;
				}
				min--;
			}
			System.out.println("UCLN cua (" + a + "," + b + ") la: " + ucln);
		}

	}

	public void timBCNN() {

		if (a == 0 || b == 0) {
			System.out.print("Nhap khong hop le!!!");
		} else {
			int max = a > b ? a : b;

			while (max % a != 0 || max % b != 0) {
				max++;
			}
			System.out.println("BCNN cua (" + a + "," + b + ") la: " + max);

		}
	}

}