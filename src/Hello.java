
public class Hello {

	public static void main(String[] args) {
		displayReverse("Hello World!");

	}

	public static void displayReverse(String s) {
		// salvam in variabila index ultima pozitie din string
		int index = s.length() - 1;
		// Atunci cand indexul atinge valoarea 0 inseamna ca
		// am parcurs toate caracterele din string
		while (index >= 0) {
			// salvam caracterul de la pozitia indexului
			char c = s.charAt(index);
			System.out.print(c);
			// decrementam
			index--;
		}

		// Adaugam un spatiu pentru a fi mai usor de citit
		System.out.println();
	}

}
