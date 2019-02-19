//Marco Carrera
//17-02-19
//3:12-3:40
 


	import java.util.Scanner;  // importamos la libreria scanner para ingresar numeros desde el teclado

	class Ejercicio15_Intercambio{ 
	public static void main(String[] Args){
        

	int aux; //Se declaran las varibles
        Scanner entrada=new Scanner(System.in); //inicializamos con el scanner
        System.out.println("Ingrese un numero a: "); //pedimos un numero
        
	int a=entrada.nextInt(); //Se ingresa por teclado
        System.out.println("Ingrese otro numero b: "); //pedimos un numero
        
	int b=entrada.nextInt(); //ingresamos a travez del teclado
        
	aux=a;  // en esta linea es donde se intercambian las variables
        a=b;
        b=aux;
        
	System.out.println("El valor de a es "+a+" y el valor de b "+b); //pedimos un numero


	}
	}