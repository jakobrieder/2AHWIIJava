
public class BeispieleArrays {
	static void arrAusgabe(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + ":" + a[i]);
		}
	}

	static void arrMax(int[] arr) {

		int max = 0;

		for (int i : arr) {

			if (i > max) {
				max = i;
			}

		}

		System.out.println(max);

	}

	static void arrUmdrehen(int[] a) {
		int pos = a.length;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[pos - 1]);
			pos--;
		}
	}

	static void arrGeradeMinusEins(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int wert = a[i];
			if (wert % 2 == 0) {
				System.out.println(wert - 1);

			}

		}

	}

	static int[] zufallsZahlen(int anz) {
		int[] zahlen = new int[anz];
		for (int i = 0; i < anz; i++) {
			zahlen[i] = (int) (Math.random() * 100) + 1;
			for (int j : zahlen) {
				if (j == zahlen[i]) {

				}

			}
		}
		return zahlen;
	}

	static int[] Array5(int[] a, int anz) {
		int[] zahlen = new int[anz];
		for (int i = 0; i < anz; i++) {
			zahlen[i] = a[i];
		}
		return zahlen;
	}

	static int[] Lotto(int anz) {
		int[] zahlen = new int[anz];
		for (int i = 0; i < anz; i++) {
			zahlen[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < anz; j++) {
				zahlen[j] = (int) (Math.random() * 45) + 1;
				if (zahlen[i] == zahlen[j]) {
					System.out.print("Test");
					zahlen[i] = (int) (Math.random() * 45) + 1;
					j--;
				}
			}
		}
		return zahlen;
	}
	public static void test() {
		int a = 0;
		System.out.println(a);
	}

	public static boolean[] groesserAls50(int zufallsZahlen[]) {
		boolean[] arr = new boolean[zufallsZahlen.length];
		for (int i = 0; i < zufallsZahlen.length; i++) {
			int zahl = (int) (Math.random() * 100) + 1;
			if (zahl > 50) {
				arr[i] = true;
			} else {
				arr[i] = false;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//		int[] b = new int[10];
//		b[0] = 10;
//		b[1] = 9;
//		b[2] = 8;
//		b[3] = 7;
//		b[4] = 6;
//		b[5] = 5;
//		b[6] = 4;
//		b[7] = 3;
//		b[8] = 2;
//		b[9] = 1;
//		arrAusgabe(a);
//		arrAusgabe(b);
//		int[] c = { 12, 23, 45, 6, 78, 1, 9, 420, 8, 69 };
//		arrMax(c);
//		arrUmdrehen(a);
//		arrGeradeMinusEins(a);
//		int anzahl = 20;// ausprinten array
//		int[] zufall = zufallsZahlen(anzahl);
//		for (int i = 0; i < anzahl; i++) {
//			System.out.println(zufall[i]);
//		}
//		int anzahl2 = 5;
//		int[] ausgeben = Array5(a, 5);
//		for (int i = 0; i < anzahl2; i++) {
//			System.out.println(ausgeben[i]);
//		}
		int anzahl = 6;
		int[] zufall = Lotto(anzahl);
		for (int i = 0; i < anzahl; i++) {
			System.out.println(zufall[i]);
		}
//		boolean[] ausgabe2 = groesserAls50(zufallsZahlen(100));
//		for (int i = 0; i < 100; i++) {
//			System.out.println(ausgabe2[i]);
//		}
//	}
	}
}
