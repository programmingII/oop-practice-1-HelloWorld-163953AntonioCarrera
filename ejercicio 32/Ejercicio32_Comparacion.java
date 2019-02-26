//Marco Carrera
//23-02-19
//11:15
	


	import java.util.Scanner; //importamos la libreria para lectura de datos
	class Ejercicio32_Comparacion{
	public static void main (String[] args){
	Scanner num=new Scanner (System.in); //creamos un objeto para almacenamiento de datos
	int x,y; //declaramos variables de tipo entero
	System.out.println ("favor de ingresar 2 numeros cualesquiera"); //pedimos ingresar 2 numeros

	x=num.nextInt (); //se lee el numero x
	y=num.nextInt (); //se lee el numero y
	System.out.println (""+x+" "+Integer.valueOf (x).compareTo (Integer.valueOf (y))+" "+y); //utilizamos los objetos valueof y compareto derivados de la clase integer,
												// uno almacena un valor y el otro lo compara respectivamente
	}}											
