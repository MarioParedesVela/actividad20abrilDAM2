import java.util.Scanner;

public class Calculadora {

	
	private static float num1;
	private static float num2;
	static String opcion2;
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static Scanner sc3 = new Scanner(System.in);
	static Scanner sc4 = new Scanner(System.in);
	
	public static void main(String [] args) {
		
		System.out.println("---CALCULADORA---");
		System.out.println("En primer lugar introduce los dos numeros a operar");
		System.out.print("Numero 1: ");
		num1 = sc.nextInt();
		System.out.print("Numero 2: ");
		num2 = sc2.nextInt();
		
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
				System.out.print(Calculadora.suma());
				break;
			
			case 2:
				
				System.out.print("\nLa resta de los numeros "+num1+" - "+num2+" = ");
				System.out.print(Calculadora.resta());
				break;
				
			case 3:
				
				System.out.print("\nLa multiplicacion de los numeros "+num1+" X "+num2+" = ");
				System.out.print(Calculadora.multiplicacion());
				break;
				
			case 4:
		
				System.out.print("\nLa division de los numeros "+num1+" / "+num2+" = ");
				System.out.print(Calculadora.division());
				break;	
				
			default:
				
				System.out.print("ERROR. Numero no valido, por favor introduce un numero del 1 al 5");
				break;
			}
			
			System.out.println("\n\nDesea realizar otra operacion? (s/n): ");
			opcion2 = sc4.nextLine(); 
			
		}while(opcion2.equalsIgnoreCase("s"));
		
	}
		
	public static float suma() {
		float res = num1+num2;
		return res;
	}
	
	public static float resta() {
		float res = num1-num2;
		return res;
	}
	
	public static float multiplicacion() {
		float res = num1*num2;
		return res;
	}
	
	public static float division() {
		float res = num1/num2;
		return res;
	}	
}
