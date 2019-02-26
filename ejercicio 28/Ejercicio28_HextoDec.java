//Marco Carrera
//23-02-19
//10:12

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio28_HextoDec{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String hex; //creamos la variable de tipo string
	int dec; //declaramos una variable de tipo entero que llamaremos dec
	System.out.println("favor de ingresar cualquier numero hexadecimal"); //pedimos ingresar numeros hexadecimales
	hex=num.nextLine (); //se almacena el numero ingresado en la variable num

	dec=Integer.parseInt (hex,16); //utilizamos el objeto parseInt derivado de la clase Integer para la conversion a base 16
	System.out.printf ("Hexaecimal="+hex+"a Decimal=" +dec); //el programa imprime la conversion de tu numero
 	}}