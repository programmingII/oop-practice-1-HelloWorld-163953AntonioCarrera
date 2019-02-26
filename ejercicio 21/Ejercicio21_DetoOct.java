//Marco Carrera
//22-02-19
//12:40

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio21_DetoOct{
	public static void main(String[] args){

	Scanner dec=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado dec
	int num; //declaramos una variable de tipo entero que llamaremos num
	String oct; //creamos la variable de tipo string
	System.out.println("favor de ingresar cualquier numero decimal"); //pedimos ingresar numeros decimales
	num=dec.nextInt (); //se almacena el numero ingresado en la variable num

	oct=Integer.toOctalString (num); //en la variable llamada oct almacenamos la conversion
	System.out.printf ("Decimal="+num+" a Octal=" +oct); //el programa imprime la conversion de tu numero
 	}}