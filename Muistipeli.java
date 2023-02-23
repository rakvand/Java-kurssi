import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Muistipeli {

	public static void main(String[] args) {
				
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		ArrayList<Integer> arvotutNumerot = new ArrayList<Integer>();
		ArrayList<Integer> arvaukset = new ArrayList<Integer>();
		
		System.out.println("Yrit� muistaa alla olevat numerot. N�et numerot 3 sekunnin ajan.");
		
		// Arvotaan 7 satunnaista numeroa v�lilt� 1-5
		arvotutNumerot.add(random.nextInt(5)+1);
		for (int i = 0; i < 6; i++) {
			arvotutNumerot.add(random.nextInt(5)+1);			
		}
		for (int i = 0; i < arvotutNumerot.size(); i++) {
			System.out.print(arvotutNumerot.get(i) + " ");
		}
		
		// Suoritus pys�htyy 3 sekunniksi
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException ex)
		{
			Thread.currentThread().interrupt();
		}
		
		// Ruutu tyhjennet��n ns. k�yh�n miehen tavalla
		for (int i = 0; i < 20; i++) System.out.println();
		
		// K�ytt�j� sy�tt�� muistelemansa numerot
		for (int i = 0; i < 7; i++) {
			System.out.println("Sy�t� " + (i+1) + ". numero:");
			arvaukset.add(in.nextInt());			
		}
		
		// Tulostetaan satunnaiset numerot uudelleen
		System.out.print("Oikeat numerot olivat: ");
		for (int i = 0; i < arvotutNumerot.size(); i++) {
			System.out.print(arvotutNumerot.get(i) + " ");
		}
		System.out.println();
		
		// Tulostetaan k�ytt�j�n sy�tt�m�t numerot
		System.out.print("Sy�tt�m�si numerot olivat: ");
		for (int i = 0; i < arvaukset.size(); i++) {
			System.out.print(arvaukset.get(i) + " ");
		}
		System.out.println();
		
		// Lasketaan kuinka monta numeroa meni oikein
		int laskuri = 0;
		for (int i = 0; i < 7; i++) {
			if (arvotutNumerot.get(i).equals(arvaukset.get(i))){
				laskuri++;
			}
		}
		System.out.println("Sait " + laskuri + " numeroa oikein.");
		
in.close();		
	}

}
