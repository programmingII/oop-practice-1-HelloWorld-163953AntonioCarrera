//Marco Carrera
//24-02-19
//9:34


import java.util.Scanner; //Se importa la libreria para almacenar datos
class Ejercicio37_Cadena{
public static void main(String [] args){
		
	Scanner x = new Scanner (System.in); //creamos un objeto nde almacenamiento de datos llamado x
	char [] cad; //hacemos un  arreglo de tipo char

	System.out.println("Ingresa la cadena"); //ingresamos la cadena
	cad = x.nextLine().toCharArray(); //Se almacena la cadena en el arreglo
	for(int i=cad.length - 1; i>=0; i--){ //Con un ciclo for que se evalua del tamaño de la cadena hasta cero decrementando 1 en cada iteracion
	System.out.println(cad[i]); //Se imprime el contenido de la cadena 
	}}}
