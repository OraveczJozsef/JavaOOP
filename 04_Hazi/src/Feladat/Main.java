package Feladat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Szemely szemely = null;
		
		boolean isValid = true;
		
		do {
			System.out.println("Kerlek add meg az adatokat! A bevitel formatuma: nev,suly,magassag");
			String[] tempArray = sc.nextLine().split(",");
			
			try {
				szemely = new Szemely(tempArray[0], Integer.parseInt(tempArray[1]), Double.parseDouble(tempArray[2]));
				//System.out.println(szemely.toString());
			} catch (Exception error) {
				System.out.println("Hiba: " + error);
				isValid = false;
			}
		} while(!isValid);
		sc.close();
		System.out.println(szemely.toString());
	}

}
