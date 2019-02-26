//Marco Carrera
//23-02-19
//3:21


	import java.util.Scanner; //Se importa la libreria Scanner que permite almacenar datos
	class Ejercicio34_AreaHexagono{
	public static void main(String[] args){
	Scanner X = new Scanner (System.in); //creamos un objeto para almacenar datos y lo llamaremos x

	int L; //declaramos la variable de tipo entero llamada L por longitud
	System.out.println("Ingresa la longitud de tu hexagono"); //Se pide ingresar la longitud del hexagono
	L = X.nextInt(); //La longitud se almacena en la varaible  L
	double H = (6*(L*L))/(4*Math.tan(Math.PI/6)); //usamos tan y pi derivadas de la clase math 
	//creamos una variable double para almacenamiento de la operacion a realizar

		
	System.out.printf("El area del hexagono es = "+H); //da el resultado del area
	}}