package AlkalmazottFeladat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Alkalmazott[] alk = new Alkalmazott[5];
		boolean isValid = true;

		for (int i = 0; i < alk.length; i++) {
			do {
				System.out.println("Kerlek add meg az adatokat! Beviteli formatum: nev,osszeg");
				String[] tempArr = sc.nextLine().split(",");

				try {
					int random = (int) (Math.random() * (5 - 1 + 1)) + 1;
					if (random == 1)
						alk[i] = new Alkalmazott(tempArr[0]);
					else
						alk[i] = new Alkalmazott(tempArr[0], Integer.parseInt(tempArr[1]));

					// alk[i].setNev(tempArr[0]);
					// alk[i].setFizetes(Integer.parseInt(tempArr[1]));

					isValid = true;
				} catch (Exception error) {
					System.out.println("Hiba: " + error);
					isValid = false;
				}
			} while (!isValid);
		}
		sc.close();

		int maxIndex = getLegnagyobbFizetes(alk);
		System.out.println(
				"A legnagyobb fizetese: " + alk[maxIndex].getNev() + ", Fizetese: " + alk[maxIndex].getFizetes());

		int min = 100;
		int max = 200;
		int darab = getDarabFizetes(alk, min, max);
		System.out.println(darab + " alkalmazott kerers " + min + " és " + max + " között.");

		double atlagFizetes = getAtlagFizetes(alk);
		System.out.println("Átlag kereslet: " + atlagFizetes);

		double atlagAdo = getAtlagAdo(alk);
		System.out.println("Átlag ado: " + atlagAdo);
	}

	private static int getLegnagyobbFizetes(Alkalmazott[] alk) {
		int index = 0;
		for (int i = 1; i < alk.length; i++) {
			if (alk[index].getFizetes() < alk[i].getFizetes())
				index = i;
		}
		return index;
	}

	private static int getDarabFizetes(Alkalmazott[] alk, int min, int max) {
		int darab = 0;
		for (int i = 0; i < alk.length; i++) {
			if (alk[i].getFizetesHatar(min, max))
				darab++;
		}
		return darab;
	}

	private static double getAtlagFizetes(Alkalmazott[] alk) {
		int atlag = 0;
		for (int i = 0; i < alk.length; i++) {
			atlag += alk[i].getFizetes();
		}
		return (double) atlag / alk.length;
	}

	private static double getAtlagAdo(Alkalmazott[] alk) {
		int atlag = 0;
		for (int i = 0; i < alk.length; i++) {
			atlag += alk[i].getAdo();
		}
		return (double) atlag / alk.length;
	}
}
