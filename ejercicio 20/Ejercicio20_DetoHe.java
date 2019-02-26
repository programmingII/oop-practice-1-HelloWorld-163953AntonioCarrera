//Marco Carrera
//22-02-19
//12:30

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio20_DetoHe{
	public static void main(String[] args){

	Scanner dec=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado dec
	int num; //declaramos una variable de tipo entero que llamaremos num
	String hex; //creamos la variable de tipo string
	System.out.println("favor de ingresar cualquier numero decimal"); //pedimos ingresar numeros decimales
	num=dec.nextInt (); //se almacena el numero ingresado en la variable num

	hex=Integer.toHexString (num); //en la variable llamada hex almacenamos la conversion
	System.out.printf ("Decimal="+num+" a Hexadecimal=" +hex); //el programa imprime la conversion de tu numero
 	}}