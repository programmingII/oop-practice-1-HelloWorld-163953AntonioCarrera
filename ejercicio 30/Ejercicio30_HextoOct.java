//Marco Carrera
//23-02-19
//10:44

	import java.util.Scanner; //importamos una libreria para lectura de datos
	class Ejercicio30_HextoOct{
	public static void main(String[] args){

	Scanner num=new Scanner(System.in); //creamos un objeto que permita almacenamiento de datos llamado num
	String hex,oct; //creamos variables de tipo string 
	System.out.println("favor de ingresar cualquier numero hexadecimal"); //pedimos ingresar numeros hexadecimales
	hex=num.nextLine (); //se almacena el numero ingresado en la variable hex

	oct=Integer.toOctalString(Integer.parseInt(hex,16)); //utilizamos el objeto toBinaryString derivado de la clase Integer para la conversion la base deseada
	System.out.printf ("Hexadecimal="+hex+" a Octal" +oct); //el programa imprime la conversion de tu numero
 	}}