//Marco Carrera
//22-02-19
//6:05

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio25_OctoDec{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String oct; //creamos una variable de tipo string
	int dec; //declaramos una variable tipo entero 
	System.out.println("favor de ingresar cualquier numero octal"); //pedimos ingresar numeros octales
	oct=num.nextLine (); //se almacena el numero ingresado en la variable oct

	dec=Integer.parseInt(oct,8); //utilizamos el objeto parseInt derivado de la clase Integer para la conversion a base 8
	System.out.printf ("Octal="+oct+" a Decimal" +dec); //el programa imprime la conversion de tu numero
 	}}