package com.aql.intutility.intt;

public class Int {
	private int soN;

	public Int(int soN) {
		this.soN = soN;
	}

	public void printSumFrom1ToN() {
		int sum = 0;
		for (int i = 0; i <= soN; i++) {
			sum = sum + i;
		}
		System.out.println("Sum: " + sum);
	}

	public boolean checkPrime() {
		boolean result = true;
		if (soN < 2) {
			result = false;
		} else {
			for (int i = 2; i < soN; i++) {
				if (soN % i == 0) {
					result = false;
					break;
				}
			}
		}
		return result;
	}

	public void printEvenNumber() {
		System.out.print("Print even number: ");
		for (int i = 0; i < soN; i += 2) {
			if (i % 2 == 0) {

				System.out.print(i + " ");
			}
		}
	}

	public void printDivider() {
		System.out.print("\nPrint divider: ");
		for (int i = 1; i < soN; i++) {
			if (soN % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// Tao ra mot soMoi bang cach dao nguoc cac chu so cua soN, sau do so sanh voi
	// soN
	public void checkSymmetry() {
		int soTmp = soN;
		int soMoi = 0;
		while (soTmp > 0) {
			int chuSo = soTmp % 10;
			soMoi = soMoi * 10 + chuSo;
			soTmp = soTmp / 10;
		}
		String kq = soN + (soMoi == soN ? " la so doi xung" : " khong la so doi xung");
		System.out.println(kq);
	}
}
