package Ejercicio2;
import java.util.Scanner;

public class Edades {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Persona[] personas = new Persona[50];
		
		System.out.println("Introduzca datos de 50 personas (sexo y edad separados por espacio): ");
	       
		//guardamos en cada posición del array personas el sexo y la edad con buenas prácticas de programación:
		for (int i = 0; i < personas.length; i++) {
			String[] datos = scanner.nextLine().split(" ");
            char sexo = datos[0].charAt(0);
            int edad = Integer.parseInt(datos[1]);
            personas[i] = new Persona(sexo, edad);
		}

	    scanner.close();
	    calcularResultados(personas);
	}
	
	static class Persona {
	    char sexo;
	    int edad;
	    
	    //constructor:
	    Persona(char sexo, int edad) {
	        this.sexo = sexo;
	        this.edad = edad;
	    }
	}
	
    static void calcularResultados(Persona[] personas) {
        int personasMayores = 0;
        int personasMenores = 0;
        int masculinosMayores = 0;
        int femeninasMenores = 0;
        int totalMujeres = 0;
        int totalPersonas = personas.length;

        for (Persona persona : personas) {
        	if (persona.edad >= 18) {
                personasMayores++;
                if (persona.sexo == 'M') {
                    masculinosMayores++;
                }else {
                	totalMujeres++;
                }
            } else {
                personasMenores++;
                if (persona.sexo == 'F') {
                	totalMujeres++;
                    femeninasMenores++;
                }
            }
        }

        //con conversión de tipo:
        double porcentajeMayores = (personasMayores / (double) totalPersonas) * 100;
        double porcentajeMujeres = (totalMujeres / (double) totalPersonas) * 100;

        //calculamos y mostramos:
        System.out.println("Total de personas mayores de edad: " + personasMayores);
        System.out.println("Total de personas menores de edad: " + personasMenores);
        System.out.println("Total de personas masculinas mayores de edad: " + masculinosMayores);
        System.out.println("Total de personas femeninas menores de edad: " + femeninasMenores);
        System.out.println("Porcentaje de personas mayores de edad: " + String.format("%.2f", porcentajeMayores) + "%");
        System.out.println("Porcentaje de mujeres: " + String.format("%.2f", porcentajeMujeres) + "%");
    }
}

