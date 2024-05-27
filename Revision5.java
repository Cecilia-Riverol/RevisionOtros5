//Ejercicio Elaborado por Sandra Riverol
//Calificación 5 de 5 por parte de Selene Rojas

package com.revision;
import java.util.Scanner;

public class Revision5 {

	public static void main(String[] args) {

		    Scanner s = new Scanner(System.in); //Se corrige system.in
		    System.out.print("Introduzca un número: "); //Se corrige comillas dobles	    
		    
		    int num = s.nextInt(); //Se corrige int y se sube el escaneo
		    int afo = 0;
		    int noAfo = 0;
		    
		     
		    while (num > 0) {
			  int digito = (num % 10); //Borro int
		      if (digito == 3 || digito == 7 || digito == 8 || digito == 9) //Boror doble parentesis
		      {
				afo++;
		      } 
		      else {
				noAfo++;
		      }
		      num /= 10; //Se coloca fuera para no buclear infinitamente
		      
		    if (afo > noAfo) {
		      System.out.println("El " + num + " es un número afortunado."); //Arreglamos ln
		    } else {
		      System.out.println("El " + num + " no es un número afortunado.");
		    
		  }  

	}
	}
}


	