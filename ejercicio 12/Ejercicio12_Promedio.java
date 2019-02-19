//Marco Carrera
//16-02-19
//2:43-3:00

	import java.util.Scanner;//importamos la libreria del scanner
	public class Ejercicio12_Promedio {
 
  	public static void main(String[] args) 
	{
  	Scanner in = new Scanner(System.in);//creamos un scanner para que nos permita ingresar datos 
  
  	System.out.print("Input first number: ");//ingresamos cualquier numero 
  	int num1 = in.nextInt();
   
  	System.out.print("Input second number: ");//ingresamos cualquier numero
  	int num2 = in.nextInt();
   
  	System.out.print("Input third number: ");//ingresamos cualquier numero
  	int num3 = in.nextInt();
   
   	System.out.println("el promedio es: " + 
   	(num1 + num2 + num3) /3);     //nos arroja el resultado del promedio de los numeros ingresados
 	}
	}