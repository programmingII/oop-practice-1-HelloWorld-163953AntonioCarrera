/*Marco Carrera
07-02-19
12:27*/

import java.util.Scanner;//me permite ingresar datos desde mi consola
 
   class ejercicio5_multiplication {
 
 public static void main (String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Input first number: ");//nos permite ingresar un numero
  int num1 = in.nextInt();
   
  System.out.print("Input second number: ");//nos permite ingresar un numero
  int num2 = in.nextInt();
   
  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);//arroja el resultado de la multiplicacion de los datos ingresados
 }
 
}

//12:51