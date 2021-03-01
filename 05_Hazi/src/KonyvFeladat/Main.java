package KonyvFeladat;

public class Main {

	public static void main(String[] args) {
		Konyv konyv = new Konyv("Kiss Vuk", "en", 1999, 20);
		Konyv konyv2 = new Konyv("Kiss Vuk", "en");

		System.out.println(konyv.toString());

		konyv.addAra(20);

		System.out.println(konyv.toString());
		System.out.println(konyv2.toString());

		konyv2.addAra(20);

		System.out.println(konyv2.toString());
	}

}
