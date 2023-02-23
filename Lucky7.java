import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		// Peli, joka arpoo 3 numeroa v‰lilt‰ 1-10
		
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int raha = 0;
		String uusiPeli;
		
		System.out.println("Kuinka monella eurolla haluat pelata?");
		raha = in.nextInt();
		in.nextLine();
		
		do {
			int luku1 = random.nextInt(10)+1;
			int luku2 = random.nextInt(10)+1;
			int luku3 = random.nextInt(10)+1;
			
			// Peli maksaa euron
			raha -=1;
			System.out.println(luku1);
			System.out.println(luku2);
			System.out.println(luku3);
			
			// Kaikki numerot ovat 7
			if (luku1 == 7 && luku2 == 7 && luku3 == 7) {
				System.out.println("Voitit 7 euroa!");
				raha += 7;
			}
			
			// Kaksi kolmesta numerosta ovat 7
			else if (luku1 == 7 && luku2 == 7) {
				System.out.println("Voitit 5 euroa!");
				raha += 5;
			}
			else if (luku1 == 7 && luku3 == 7) {
				System.out.println("Voitit 5 euroa!");
				raha += 5;
			}
			else if (luku2 == 7 && luku3 == 7) {
				System.out.println("Voitit 5 euroa!");
				raha += 5;
			}
			
			// Yksi numeroista on 7
			else if (luku1 == 7 || luku2 == 7 || luku3 == 7) {
				System.out.println("Voitit 3 euroa!");
				raha += 3;
			}
			
			else {
				System.out.println("H‰visit!");
			}	
			
			// Raham‰‰r‰ kierroksen j‰lkeen
			System.out.print("Saldo: ");
			System.out.println(raha + " euroa.");
			
			// Kysyt‰‰n pelaatko uudestaan (kyll‰/ei)
			System.out.println("Pelaatko uudestaan (k/e)?");			
			uusiPeli = in.nextLine();
		
		
			
		} while (raha != 0 && uusiPeli.equals("k"));
		
		System.out.println("Kiitos pelaamisesta!");
		
	
	}

}
