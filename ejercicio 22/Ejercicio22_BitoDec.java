//Marco Carrera
//22-02-19
//12:53

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio22_BitoDec{
	public static void main(String[] args){

	Scanner bin=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado bin
	String bina; //creamos la variable de tipo string
	int dec; //declaramos una variable de tipo entero 
	System.out.println("favor de ingresar cualquier numero binario"); //pedimos ingresar numeros binarios
	bina=bin.nextLine (); //se almacena el numero ingresado en la variable bina

	dec=Integer.parseInt (bina,2); //en la variable llamada dec almacenamos la conversion
	System.out.printf ("Binario="+bina+"a Decimal=" +dec); //el programa imprime la conversion de tu numero
 	}}