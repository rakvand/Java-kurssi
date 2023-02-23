import java.util.Scanner;

public class Arvauspeli {

	public static void main(String[] args) {
		// Peli, joka pyyt‰‰ arvaamaan nimen
		
		Scanner in = new Scanner(System.in);
		
		String arvaus;
		String oikeaVastaus = "Riikka";
		int laskuri = 0;
		char k1 = oikeaVastaus.charAt(0);
		char k2 = oikeaVastaus.charAt(1);
		char k3 = oikeaVastaus.charAt(2);
		char k4 = oikeaVastaus.charAt(3);
				
		System.out.println("Arvaa nimeni. (Voit lopettaa kirjoittamalla loppu.)");
		arvaus = in.nextLine();
		
		// Pelin lopetus heti
		if (arvaus.equalsIgnoreCase("loppu")) {
			System.out.println("Lopetit pelin.");
			System.exit(0);
		}
					
		do {
			// V‰‰rin arvattu
			if (!arvaus.equalsIgnoreCase(oikeaVastaus)) {
				// Lis‰t‰‰n arvauslaskuriin 1
				laskuri++;
				
				if (laskuri == 1) {
					System.out.println("Arvasit v‰‰rin. Yrit‰ uudestaan. (Voit lopettaa kirjoittamalla loppu.)");
					// Ensimm‰inen vihje
					System.out.println("Ensimm‰inen kirjain on " + k1 + ".");
				}
				
				arvaus = in.nextLine();
				
				// Toinen vihje
				if (laskuri == 1 && !arvaus.equalsIgnoreCase(oikeaVastaus) && !arvaus.equalsIgnoreCase("loppu")) {
					System.out.println("Arvasit v‰‰rin. Yrit‰ uudestaan. (Voit lopettaa kirjoittamalla loppu.)");
					System.out.println("Toinen kirjain on " + k2 + ".");
				}
				
				// Kolmas vihje
				if (laskuri == 2 && !arvaus.equalsIgnoreCase(oikeaVastaus) && !arvaus.equalsIgnoreCase("loppu")) {
					System.out.println("Arvasit v‰‰rin. Yrit‰ uudestaan. (Voit lopettaa kirjoittamalla loppu.)");
					System.out.println("Kolmas kirjain on " + k3 + ".");
				}
				
				// Nelj‰s vihje
				if (laskuri == 3 && !arvaus.equalsIgnoreCase(oikeaVastaus) && !arvaus.equalsIgnoreCase("loppu")) {
					System.out.println("Arvasit v‰‰rin. Yrit‰ uudestaan. (Voit lopettaa kirjoittamalla loppu.)");
					System.out.println("Nelj‰s kirjain on " + k4 + ".");
				}
				
				// Muihin arvauksiin ei en‰‰ vihjeit‰
				if (laskuri >= 4 && !arvaus.equalsIgnoreCase(oikeaVastaus) && !arvaus.equalsIgnoreCase("loppu")) {
					System.out.println("Arvasit v‰‰rin. Yrit‰ uudestaan. (Voit lopettaa kirjoittamalla loppu.)");
					System.out.println("Enemp‰‰ et saa vihjeit‰.");
				}
					
			}
			// Oikein arvattu
			if (arvaus.equalsIgnoreCase(oikeaVastaus)) {
				// Lis‰t‰‰n arvauslaskuriin 1
				laskuri++;
				System.out.println("Arvasit oikein!");
				
			}
			// Pelin lopetus kesken arvausten
			if (arvaus.equalsIgnoreCase("loppu")) {
				System.out.println("Lopetit pelin.");
				break;
			}

		} while(!arvaus.equalsIgnoreCase(oikeaVastaus));
		
		// Kuinka monta kertaa arvattu
		System.out.println("Arvasit " + laskuri + " kertaa. Kiitos pelaamisesta!");
	

in.close();
	}

}
