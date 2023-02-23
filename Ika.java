
public class Ika {

	public static void main(String[] args) {
		// Ohjelma, joka kertoo iän perusteella, mitä kukakin saa tai voi tehdä
		
		int ika = 51;
		
		// Tulostusehdot		
		
		if (ika > 0 && ika < 18)
		{
			System.out.println("Olet alaikäinen");
			// Jos 15-vuotias, saa ajaa mopoa
			if (ika >= 15) {
				System.out.println("Saat ajaa mopoa");
			}			
			// Jos 16-17-vuotias, saa ajaa kevaria			
			if (ika >= 16 || ika >= 17) {
				System.out.println("Saat ajaa kevaria");
			}
		}
		 			
		else if (ika >= 65)
		{
			System.out.println("Olet eläkeläinen");
			// Tasan 65-vuotiaille hyvien eläkepäivien toivotus
			if (ika == 65) {
				System.out.print("Hyviä eläkepäiviä!");
			}
			// Onnittelut jos täyttää pyöreitä
			if (ika == 70 || ika == 80 || ika == 90) {
				System.out.println("Onnittelut tasavuosikymmenistä!");
			}
			// 100-vuotiaalle kolminkertaiset onnittelut
			if (ika == 100) {
				System.out.println("Onnea 100-vuotiaalle!");
				System.out.println("Onnea 100-vuotiaalle!");
				System.out.println("Onnea 100-vuotiaalle!");
			}
		}
						
		else
		{
			System.out.println("Olet aikuinen");
			// Jos 18-vuotias, on täysi-ikäinen ja saa ajaa autoa
			if (ika == 18) {
				System.out.println("Olet juuri tullut täysi-ikäiseksi. Saat ajaa autoa");
			}
			// Onnittelut jos täyttää pyöreitä
			if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60) {
				System.out.println("Onnittelut tasavuosikymmenistä!");
			}
			// Yli 58-vuotiaat voivat mennä varhaiseläkkeelle
			if (ika > 58) {
				System.out.println("Voit jäädä varhaiseläkkeelle");
			}
			// 40-50-vuotiaille toivotetaan parasta keski-ikää
			if (ika >= 40 && ika <= 50) {
				System.out.println("Parasta keski-ikää!");
			}
			
		}

	}

}
