//Marco Carrera
//22-02-19
//6:28

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio27_OcttoHex{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String oct,hex; //creamos variables de tipo string 
	System.out.println("favor de ingresar cualquier numero octal"); //pedimos ingresar numeros octales
	oct=num.nextLine (); //se almacena el numero ingresado en la variable oct

	hex=Integer.toString(Integer.parseInt(oct,8),16); //utilizamos el objeto toString derivado de la clase Integer para la conversion a base 16
	System.out.printf ("Octal="+oct+" a Hexadecimal" +hex); //el programa imprime la conversion de tu numero
 	}}