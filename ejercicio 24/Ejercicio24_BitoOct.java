//Marco Carrera
//22-02-19
//5:56

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio24_BitoOct{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String bin,oct; //creamos variables de tipo string 
	System.out.println("favor de ingresar cualquier numero binario"); //pedimos ingresar numeros binarios
	bin=num.nextLine (); //se almacena el numero ingresado en la variable bin

	oct=Integer.toString (Integer.parseInt(bin,2),8); //utilizamos el objeto toString derivado de la clase Integer para la conversion a base 8
	System.out.printf ("Binario="+bin+" a Octal" +oct); //el programa imprime la conversion de tu numero
 	}}