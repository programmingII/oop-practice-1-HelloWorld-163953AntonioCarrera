//Marco Carrera
//24-02-19
//6:26


	import java.util.Scanner; //Se importa la libreria que permite almacenar datos
	class Ejercicio44_Integer{
	public static void main (String[] args){
	
	Scanner num=new Scanner (System.in); //creamos el objeto encargado de almacenar los datos
	int a; //declaramos una variable de tipo entero

	System.out.println ("Favor de ingresar un numero"); //pedimos ingresar un numero cualquiera
	a=num.nextInt ();			
	System.out.println (a+" + "+a+""+a+" + "+a+""+a+""+a);
	}}