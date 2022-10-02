
public class Arrays {
	static void ausgabe(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
		}
	}

	static int summe(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	static int suche(int[] heuHaufen, int nadel) {
		for (int i = 0; i < heuHaufen.length; i++) {
			if (heuHaufen[i] == nadel) {
				return i;
			}
		}
		return -1;
	}

	static int summe2(int[] arr) {// das ist gleich wie die for schleife zum durchgehen des Arrays
		int sum = 0;
		for (int num : arr) {
			sum += num;

		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9 };
//		ausgabe(arr);
//		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		ausgabe(arr2);
		int pos = suche(arr, 5);
		System.out.println("Erste Position von 5 ist: " + pos);
		System.out.println(summe2(arr));
	}
}
