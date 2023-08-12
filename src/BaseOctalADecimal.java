/*
 *MARVIN GEOBANY REYNA ORTEGA 7690-22-8291 
 * 
 * PARCIAL 1
 */


import java.util.Scanner;
public class BaseOctalADecimal {

	public static void main(String[] args) {
		
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un numero octal: ");
			
			try {
			    int octal = scanner.nextInt();
			    OctalADecimal convertir = new OctalADecimal(octal);
			    int ResultDecimal = convertir.convert();
			    System.out.println("El numero decimal equivalente es: " + ResultDecimal);
			} catch (Exception e) {
			    System.out.println("Entrada invalida. Ingrese un numero octal valido.");
			}
		}
    }
}
