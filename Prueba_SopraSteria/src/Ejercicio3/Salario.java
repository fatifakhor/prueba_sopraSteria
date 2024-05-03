package Ejercicio3;
import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salario;
		
		System.out.println("Introduzca las horas trabajadas: ");
		int horasTrabajadas = scanner.nextInt();
		
		System.out.println("Cuál es la tarifa por horas?: ");
		double tarifa = scanner.nextDouble();
		
		scanner.close();
		
		if(horasTrabajadas <= 40) { //si es menor o igual que 40 se calculan las horas por la tarifa introducida
			salario = horasTrabajadas * tarifa;
		} else {  //si es mayor entra por aquí
			int horas = 40;
			int horasExtra = horasTrabajadas - horas; 
			double salarioCorriente = horas * tarifa;
			double tarifaExtra = tarifa * 1.5; 
			double salarioExtra = horasExtra * tarifaExtra;
			salario = salarioCorriente + salarioExtra;
		}
		
		System.out.println("El sueldo es: " + salario);
	}
}
