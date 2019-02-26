//Marco Carrera
//22-02-19
//6:15

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio26_OcttoBi{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String oct,bin; //creamos variables de tipo string 
	System.out.println("favor de ingresar cualquier numero octal"); //pedimos ingresar numeros octales
	oct=num.nextLine (); //se almacena el numero ingresado en la variable oct

	bin=Integer.toString(Integer.parseInt(oct,8),2); //utilizamos el objeto toString derivado de la clase Integer para la conversion a base 8
	System.out.printf ("Octal="+oct+" a Binario" +bin); //el programa imprime la conversion de tu numero
 	}}