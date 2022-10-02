
public class SystemCheck {

	public static void main(String[] args) {
		String str1 = "Das ist ein Text";
		String str2 = umdrehen(str1);
		System.out.println(str2);
	}

	public static String umdrehen(String str) {
		String rev = "";
		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		return rev;
	}
}
