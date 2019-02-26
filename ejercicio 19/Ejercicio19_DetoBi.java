//Marco Carrera
//22-02-19
//12:09

	import java.util.Scanner;//importamos una libreria para lectura de datos
	class Ejercicio19_DetoBi{
	public static void main(String[] args){

	Scanner bin=new  Scanner (System.in);//creamos un objeto que permita el almacenamiento de datos
	int num;//declaramos una variable de tipo entero que llamaremos num
	System.out.printf("ingresa un numero que desees convertir: ");//pedimos ingresar un numero 
	num=bin.nextInt();//el programa lee el numero que hemos ingresado y lo almacena en nuestra variable

	if(num>0){ //creamos un ciclo con la unica condicion que el programa se ejecute solo si el numero ingresado es mayor a cero
	System.out.printf("la conversion de tu numero es :" +(Integer.toBinaryString(num))); // el programa imprime la conversion de tu numero
	}}}