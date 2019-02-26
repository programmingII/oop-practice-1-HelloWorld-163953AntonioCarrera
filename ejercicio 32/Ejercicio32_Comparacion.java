//Marco Carrera
//23-02-19
//11:15
	


	import java.util.Scanner; //importamos la libreria para lectura de datos
	class Ejercicio32_Comparacion{
	public static void main (String[] args){
	Scanner num=new Scanner (System.in); //creamos un objeto para almacenamiento de datos
	int a,b; //declaramos variables de tipo entero
	System.out.println ("favor de ingresar 2 numeros cualesquiera"); //pedimos ingresar 2 numeros

	a=num.nextInt (); //se lee el numero a
	b=num.nextInt (); //se lee el numero b
	System.out.println (""+a+" "Integer.valueof (a).compareTo (Integer.valueOf (b) )+" "+b); //utilizamos los objetos valueof y compareto derivados de la clase integer,
	
	}}											// uno almacena un valor y el otro lo compara respectivamente
