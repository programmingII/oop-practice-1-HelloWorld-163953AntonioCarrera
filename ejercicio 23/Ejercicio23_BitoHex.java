//Marco Carrera
//22-02-19
//5:43

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio23_BitoHex{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String bin,hex; //creamos variables de tipo string 
	System.out.println("favor de ingresar cualquier numero binario"); //pedimos ingresar numeros binarios
	bin=num.nextLine (); //se almacena el numero ingresado en la variable bin

	hex=Integer.toString (Integer.parseInt(bin,2),16); //utilizamos el objeto toString derivado de la clase Integer para la conversion a base 16
	System.out.printf ("Binario="+bin+" a Hexadecimal=" +hex); //el programa imprime la conversion de tu numero
 	}}