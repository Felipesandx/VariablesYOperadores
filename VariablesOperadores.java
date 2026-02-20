package main;


import java.util.Scanner;


public class VariablesOperadores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba dos números enteros:");
		int entero1 = sc.nextInt();
		int entero2 = sc.nextInt();
		System.out.println("Ahora dos números decimales:");
		double decimal1 = sc.nextDouble();
		double decimal2 = sc.nextDouble();
		System.out.println("Dos palabras: ");
		String pal1 = sc.next();
		String pal2 = sc.next();
		System.out.println("Dos valores booleanos (True/False)");
		boolean bool1 = sc.nextBoolean();
		boolean bool2 = sc.nextBoolean();
		
		sc.close();
		System.out.println("La suma de los enteros es:"+(entero1+entero2));
		System.out.println("La de resta los enteros es:"+(entero1-entero2));
		System.out.println("La división de los enteros es:"+(entero1/entero2));
		System.out.println("La multiplicación de los enteros es:"+(entero1*entero2));
		
		System.out.println(" ");
		System.out.println("La suma de los decimales es:"+(decimal1+decimal2));
		System.out.println("La resta de los decimales es:"+(decimal1-decimal2));
		System.out.println("La división de los decimales es:"+(decimal1/decimal2));
		System.out.println("La multiplicación de los decimales es:"+(decimal1*decimal2));
		
		System.out.println(" ");
		System.out.println("Su primera palabra es:"+pal1);
		System.out.println("Su segunda palabra es:"+pal2);
		System.out.println("Su palabra concatenada es:"+(pal1+pal2));

		System.out.println(" ");
		System.out.println("Su primer valor booleano es:"+bool1);
		System.out.println("Su segundo valor booleano es:"+bool2);


	}

}
