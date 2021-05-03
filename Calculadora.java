import java.util.Scanner;

public class Calculadora {
	private static float num1;
	private static float num2;
	
	public static void main(String [] args) {
		calcularOperacion();
	}
	
	/**
	 * Método estatico que realiza una suma
	 * @return la suma de 2 números
	 */
	public static float suma() {
		float res = num1+num2;
		return res;
	}
	
	/**
	 * Método estatico que realiza una resta
	 * @return la resta de 2 números
	 */
	public static float resta() {
		float res = num1-num2;
		return res;
	}
	
	/**
	 * Método estatico que realiza una multiplicación
	 * @return la multiplicación de 2 números
	 */
	public static float multiplicacion() {
		float res = num1*num2;
		return res;
	}
	
	/**
	 * Método estatico que realiza una division
	 * @return null si el número 2 es 0 o la division de 2 números
	 */
	public static float division() {
		float res=(Float) null;
		if (num2==0) {
			System.out.print("No se puede dividir entre cero");
		}else {
			res = num1/num2;
		}
		return res;
	}
	
	/**
	 * Método estatico que realiza la eleccion
	 */
	public static void eleccionMenu() {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String opcion2;
		
		do {
			System.out.println("\n");
			System.out.println("1.Suma");
			System.out.println("2.Resta");
			System.out.println("3.Multiplicacion");
			System.out.println("4.Division");
			System.out.println("");
			System.out.println("Selecciona una opcion: ");
			int opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.print("\nLa suma de los numeros "+num1+" + "+num2+" = ");
				System.out.print(CalculadoraMario.suma());
				break;
			
			case 2:
				System.out.print("\nLa resta de los numeros "+num1+" - "+num2+" = ");
				System.out.print(CalculadoraMario.resta());
				break;
				
			case 3:
				System.out.print("\nLa multiplicacion de los numeros "+num1+" X "+num2+" = ");
				System.out.print(CalculadoraMario.multiplicacion());
				break;
				
			case 4:
				System.out.print("\nLa division de los numeros "+num1+" / "+num2+" = ");
				System.out.print(CalculadoraMario.division());
				break;	
				
			default:
				System.out.print("ERROR. Numero no valido, por favor introduce un numero del 1 al 4");
				break;
			}
			System.out.println("\n\nDesea realizar otra operacion? (s/n): ");
			opcion2 = sc2.nextLine(); 
			
		}while(opcion2.equalsIgnoreCase("s"));
	}	
	
	/**
	 * Método estatico que realiza una division
	 */
	public static void calcularOperacion() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---CALCULADORA---");
		System.out.println("En primer lugar introduce los dos numeros a operar");
		System.out.print("Numero 1: ");
		num1 = sc.nextFloat();
		System.out.print("Numero 2: ");
		num2 = sc.nextFloat();
		
		eleccionMenu();
	}
}
