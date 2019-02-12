/*Marco Carrera
10-02-19
1:13*/

import java.util.Scanner;//permite el ingreso de datos en la consola
 
	public class ejercicio6_operacionesbasicas {

 	public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
   
  	System.out.print("Input first number marco: ");//nos permite ingresar un numero
  	int num1 = in.nextInt();
   
  	System.out.print("Input second number marco : ");//nos permite ingresar un numero
  	int num2 = in.nextInt();
   
 	 System.out.println(num1 + " + " + num2 + " = " + //suma dos numeros
  	(num1 + num2));
   
  	System.out.println(num1 + " - " + num2 + " = " + //resta dos numeros
  	(num1 - num2));
   
  	System.out.println(num1 + " x " + num2 + " = " + //multiplica dos numeros
  	(num1 * num2));
   
  	System.out.println(num1 + " / " + num2 + " = " + //divide dos numeros
  	(num1 / num2));
 
  	System.out.println(num1 + " mod " + num2 + " = " + //arroja el resultado de los 2 numeros introducidos
  	(num1 % num2));
 }
 
}

