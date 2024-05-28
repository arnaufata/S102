package n2exercici1;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class Entrada {

	static Scanner teclat = new Scanner(System.in);
	
	// Mètodes a implantar capturant l’excepció de la classe InputMismatchException:

	public static byte llegirByte(String missatge) throws InputMismatchException  {
		byte valor = 0;
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.nextByte();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Format incorrecte. Siusplau, introdueix un byte vàlid.");
				teclat.nextLine();
			}
		} while (!valid);
		return valor;
	}

	public static int llegirInt(String missatge) throws InputMismatchException {
		int valor = 0;
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.nextInt();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Format incorrecte. Siusplau, introdueix un int vàlid.");
				teclat.nextLine();
			}
		} while (!valid);
		return valor;
	}

	public static float llegirFloat(String missatge) throws InputMismatchException {
		float valor = 0;
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.nextFloat();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Format incorrecte. Siusplau, introdueix un float vàlid.");
				teclat.nextLine();
			}
		} while (!valid);
		return valor;
	}

	public static double llegirDouble(String missatge) throws InputMismatchException {
		double valor = 0;
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.nextDouble();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("Error: Format incorrecte. Siusplau, introdueix un double vàlid.");
				teclat.nextLine();
			}
		} while (!valid);
		return valor;
	}

	// Mètodes a implantar capturant l’excepció de la classe Exception:
	
	public static char llegirChar(String missatge) {
		char valor = '\u0000';
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				String input = teclat.next();
				if (input.length() == 1) {
					valor = input.charAt(0);
					valid = true;
				} else {
					throw new Exception("Error: Format incorrecte. Siusplau, introdueix un caràcter vàlid.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!valid);
		return valor;
	}

	public static String llegirString(String missatge) {
		String valor = "";
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.nextLine();
				valid = true;
			} catch (Exception e) {
				System.out.println("Error: Format incorrecte. Siusplau, introdueix un String vàlid.");
				teclat.nextLine();
			}
		} while (!valid);
		return valor;
	}

	public static boolean llegirSiNo(String missatge) {
		String valor = "";
		boolean valid = false;
		do {
			try {
				System.out.print(missatge);
				valor = teclat.next();
				if (valor.equalsIgnoreCase("s")) {
					System.out.println("true");
					valid = true;
				} else if (valor.equalsIgnoreCase("n")) {
					System.out.println("false");
					valid = true;
				} else {
					throw new Exception("Error: Siusplau, introdueix 's' o 'n'.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (!valid);
		return valid;
	}
}
