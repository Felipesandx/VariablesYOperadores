package com.progra1;


import java.util.Scanner;


public class VariablesOperadores {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Declarando los datos validos para entrar
		String user1 = "Felipe Sandoval"; String pass1 = "Adm123";
		String user2 = "Admin";	String pass2 = "12345";
			
		System.out.println("Escribe tu usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Escribe tu contraseña: ");
		String contrasena = sc.nextLine();
		//comprobando usuarios y contraseñas
		if (usuario.equals(user1) || usuario.equals(user2)) {
			if ((usuario.equals(user1) && contrasena.equals(pass1)) ||
				(usuario.equals(user2) && contrasena.equals(pass2))) {
				System.out.println("Acceso concedido! Bienvenido!");
			}else {
				System.out.println("Contraseña incorrecta");
				sc.close();
				return;
			}
				
		} else {
		    System.out.println("Usuario no registrado");
		    sc.close();
		    return;
		}
		int opcion;
		//Iniciando el ciclo do-while para el menú 
		do {
		System.out.println("Menú Principal");
		System.out.println("1. Declaración de Variables");
		System.out.println("2. Operaciones Matemáticas");
		System.out.println("3. Operaciones Lógicas");
		System.out.println("4. Clasificación de Edad");
		System.out.println("5. Día de la Semana");
		System.out.println("0. Salir");
		System.out.print("Selecciona una opción: ");
		opcion = sc.nextInt();
		//Cada case es un inciso de la tarea (excepto el 0).
		switch (opcion){
		case 0: 
			System.out.println("Saliendo del programa...");
			break;
			case 1:
				System.out.println("Declaracion de variables");
				System.out.println("Por favor, escriba un número entero: ");
				int entero1 = sc.nextInt();
				
				System.out.println("Ahora un número decimal: ");
				double decimal1 = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Escribe UNA palabra: ");
				String palabra1 = sc.nextLine();

				System.out.println("Un valor booleano (True/False)");
				boolean booleano1 = sc.nextBoolean();
				
				System.out.println("Su nombre es: "+usuario);
				System.out.println("");
				
				System.out.println("Su valor entero es: "+entero1);
				System.out.println("Su valor decimal es: "+decimal1);
				System.out.println("Su palabra es: "+palabra1);	
				System.out.println("Su valor booleano es: "+booleano1);
				break;
			case 2: 
				System.out.println("");
				System.out.println("Operaciones Matemáticas");
				System.out.println("Por favor, introduce dos numeros enteros:");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				System.out.println("");
				System.out.println("La suma de los enteros es: "+(num1+num2));
				System.out.println("La de resta los enteros es: "+(num1-num2));
				System.out.println("La división de los enteros es: "+((double)num1/num2));
				System.out.println("La multiplicación de los enteros es: "+(num1*num2));
				
				System.out.println(" ");
				System.out.println("Por favor, introduce dos numeros decimales (double):");
				double deci1 = sc.nextDouble();
				double deci2 = sc.nextDouble();
				System.out.println("La suma de los decimales es: "+(deci1+deci2));
				System.out.println("La resta de los decimales es: "+(deci1-deci2));
				System.out.println("La división de los decimales es: "+(deci1/deci2));
				System.out.println("La multiplicación de los decimales es: "+(deci1*deci2));
				
				System.out.println(" ");
				System.out.println("Introduce dos numeros float: ");
				float deci3 = sc.nextFloat();
				float deci4 = sc.nextFloat();
				System.out.println("La suma de los decimales (float) es: "+(deci3+deci4));
				System.out.println("La resta de los decimales (float) es: "+(deci3-deci4));
				System.out.println("La división de los decimales (float) es: "+(deci3/deci4));
				System.out.println("La multiplicación de los decimales (float) es: "+(deci3*deci4));
		
				System.out.println(" ");
				System.out.println("Introduce dos numeros Short: ");
				short num3 = sc.nextShort();
				short num4 = sc.nextShort();
				System.out.println("La suma de los números (short) es: "+(num3+num4));
				System.out.println("La resta de los números (short) es: "+(num3-num4));
				System.out.println("La división de los números (short) es: "+((double)num3/num4));
				System.out.println("La multiplicación de los números (short) es: "+(num3*num4));
				
				System.out.println(" ");
				System.out.println("Introduce dos numeros Byte: ");
				byte num5 = sc.nextByte();
				byte num6 = sc.nextByte();
				System.out.println("La suma de los números (Byte) es: "+(num5+num6));
				System.out.println("La resta de los números (Byte) es: "+(num5-num6));
				System.out.println("La división de los números (Byte) es: "+((double)num5/num6));
				System.out.println("La multiplicación de los números (Byte) es: "+(num5*num6));
				break;
			case 3:
			    System.out.println("Operaciones Lógicas");
			    System.out.println("Ingrese dos números:");
			    double deci5 = sc.nextDouble();
			    double deci6 = sc.nextDouble();
			    
			    if (deci5 > deci6) {
			        System.out.println(deci5 + " es mayor que " + deci6);
			    }
			    
			    if (deci5 < deci6) {
			        System.out.println(deci5 + " es menor que " + deci6);
			    }
			    
			    if (deci5 == deci6) {
			        System.out.println(deci5 + " es igual a " + deci6);
			    }
			    
			    if (deci5 > 0 && deci6 > 0) {
			        System.out.println("Ambos números son positivos (AND)");
			    }
			    
			    if (deci5 > 0 || deci6 > 0) {
			        System.out.println("Al menos uno de los números es positivo (OR)");
			    }
			    break;
			case 4:
			    System.out.println("Clasificación de Edad");
			    System.out.println("Introduzca su edad:");
			    int edad = sc.nextInt();
			    
			    if (edad < 12) {
			        System.out.println("Eres un niño");
			    } else if (edad >= 12 && edad < 18) {
			        System.out.println("Eres un adolescente");
			    } else if (edad >= 18 && edad < 60) {
			        System.out.println("Eres un adulto");
			    } else {
			        System.out.println("Eres un adulto mayor");
			    } 
			    break;
			case 5:
				System.out.println("Día de la semana");
				System.out.println("Por favor, introduce un día 1-7");
				
				int dia = sc.nextInt();
				switch (dia) {
				case 1:
					System.out.println("Día Lunes");
					break;	
				case 2:
					System.out.println("Día Martes");
					break;
				case 3:
					System.out.println("Día Miércoles");
					break;
				case 4:
					System.out.println("Día Jueves");
					break;
				case 5:
					System.out.println("Día Viernes");
					break;
				case 6:
					System.out.println("Día Sábado");
					break;
				case 7:
					System.out.println("Día Domingo");
					break;
				default: 
					System.out.println("Introduzca un numero valido entre 1 y 7.");
					break;
				}
				break;
		    default:
			        System.out.println("Opción inválida. Por favor selecciona una opción del 0 al 5.");
			        break;
			}
		if (opcion != 0) {
			System.out.println("Presiona Enter para volver al menú...");
			sc.nextLine();
			sc.nextLine();
		}
		} while (opcion !=0);
		
		sc.close();
			
	}

}
