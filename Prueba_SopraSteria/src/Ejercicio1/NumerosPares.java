package Ejercicio1;
import java.util.Scanner;

public class NumerosPares {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduzca un n�mero entero: ");
	        int numero = scanner.nextInt();
	        
	        if (numero % 2 == 0) { //si es par entra por aqu�, indica que es par y los demuestra descendientemente
	        	System.out.println("El n�mero " + numero + " es par");
	        	System.out.println("Pares descendientes desde el n�mero introducido: ");
	        	for (int i = numero; i >= 0; i -= 2) {
					System.out.println(i);
				}
	        } else { //si es impar entra por aqu�, indica que es impar y los demuestra descendientemente
	        	System.out.println("El n�mero " + numero + " es impar");
	        	System.out.println("Impares descendientes desde el n�mero introducido: ");
	        	for (int i = numero; i >= 1; i -= 2) {
	        		System.out.println(i);
					
				}
	        }
	        
	        scanner.close();
	    }
}

