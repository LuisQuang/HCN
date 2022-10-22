public class Text {
	private String text;

	public Text(String text) {
		this.text = text;
	}

	public void upperCaseChar() {
		System.out.println("Chuyen in hoa chuoi nhap vao: " + text.toUpperCase());
	}

	public void reverse() {
		System.out.print("Chuoi dao nguoc: ");
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
	}

	public void upperCaseFirstChars() {
		String kq = "";
		for (int i = 0; i < text.length(); i++) {
			String nam = text.charAt(i) + "";
			if (i == 0 || text.charAt(i - 1) == ' ') {
				nam = nam.toUpperCase();
			}
			kq += nam;
		}
		System.out.println("\nViet hoa cac chu cai dau: " + kq);
	}

	public void reverseCase() {
		String kq = "";
		for (int i = 0; i < text.length(); i++) {
			String nam = text.charAt(i) + "";
			String namMoi = nam.toUpperCase();
			if (namMoi.equals(nam)) {
				namMoi = nam.toLowerCase();
			}
			kq += namMoi;
		}

		System.out.println("Dao nguoc hoa-thuong: " + kq);
	}
}// toi la LuisQuang!!!