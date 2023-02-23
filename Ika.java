
public class Ika {

	public static void main(String[] args) {
		// Ohjelma, joka kertoo i�n perusteella, mit� kukakin saa tai voi tehd�
		
		int ika = 51;
		
		// Tulostusehdot		
		
		if (ika > 0 && ika < 18)
		{
			System.out.println("Olet alaik�inen");
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
			System.out.println("Olet el�kel�inen");
			// Tasan 65-vuotiaille hyvien el�kep�ivien toivotus
			if (ika == 65) {
				System.out.print("Hyvi� el�kep�ivi�!");
			}
			// Onnittelut jos t�ytt�� py�reit�
			if (ika == 70 || ika == 80 || ika == 90) {
				System.out.println("Onnittelut tasavuosikymmenist�!");
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
			// Jos 18-vuotias, on t�ysi-ik�inen ja saa ajaa autoa
			if (ika == 18) {
				System.out.println("Olet juuri tullut t�ysi-ik�iseksi. Saat ajaa autoa");
			}
			// Onnittelut jos t�ytt�� py�reit�
			if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60) {
				System.out.println("Onnittelut tasavuosikymmenist�!");
			}
			// Yli 58-vuotiaat voivat menn� varhaisel�kkeelle
			if (ika > 58) {
				System.out.println("Voit j��d� varhaisel�kkeelle");
			}
			// 40-50-vuotiaille toivotetaan parasta keski-ik��
			if (ika >= 40 && ika <= 50) {
				System.out.println("Parasta keski-ik��!");
			}
			
		}

	}

}
