//Marco Carrera
//23-02-19
//4:04



	import java.util.Scanner;  //Se importa la libreria Scanner que permite almacenar datos
	class Ejercicio35_APoligono{
	public static void main(String[]args){
	Scanner V=new Scanner(System.in); //creamos un objeto para almacenar datos y lo llamaremos v por Valor
	
	int N,L; //declaramos variables de tipo entero 
	System.out.println("Ingresa el numero de lados que posee el poligono: ");
	N=V.nextInt();
	
	System.out.println("Ingresa la longitud de los lados del poligono: ");
	L=V.nextInt();
	
	System.out.println("El area del poligono es: "+ ((N*L*L)/(4*Math.tan(Math.PI/N)))); //usamos tan y pi derivadas de la clase math 
	//creamos una variable double para almacenamiento de la operacion a realizar
	}}