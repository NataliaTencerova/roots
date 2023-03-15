package Roots;

import java.util.Locale;
import java.util.Scanner;

public class Number_of_roots {
	
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Zadej koeficient a: ");
		double a = sc.nextDouble();
		System.out.println("Zadej koeficient b: ");
		double b = sc.nextDouble();
		System.out.println("Zadej koeficient c: ");
		double c = sc.nextDouble();
		
		System.out.println("Zadej pocatek intervalu x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Zadej konec intervalu x2: ");
		double x2 = sc.nextDouble();
		
		double  firstRoot = 0, secondRoot = 0;
		String result = "reseni: ";
		
		double determinant = b * b - 4.0 * a * c;
		double squareRoot = Math.sqrt(determinant);
		
		if (determinant > 0) {
			firstRoot = (-b + (double) squareRoot) / (2.0 * a);
			secondRoot = (-b - (double) squareRoot) / (2.0 * a);
			
			if ((firstRoot >= x1 && firstRoot <= x2) && (secondRoot >= x1 && secondRoot <= x2)) {
				System.out.println(result+"existuji dve");
				System.out.println(firstRoot);
				System.out.println(secondRoot);
			}
			
			if ((firstRoot >= x1 && firstRoot <= x2) || (secondRoot >= x1 && secondRoot <= x2)) {
				System.out.println(result+"existuje jedno");
			}
			
			else {
				System.out.println(result+"neexistuje");
			}
		}
		
		if (determinant == 0) {
			firstRoot = secondRoot = -b / (2.0 * a);
			
			if (firstRoot >= x1 && firstRoot <= x2) {
				System.out.println(result+"existuje jedno");
			}
			
			else {
				System.out.println(result+"neexistuje");
			}
		}
		else {
			System.out.println(result+"neexistuje");
		}
	}
}