//Marco Carrera
//24-02-19
//5:47

        import java.util.Scanner; //Se importa la libreria que nos permite almacenar datos
	class Ejercicio41_Ascii{
	public static void main(String [] args){	
	Scanner x=new Scanner (System.in);
	char X ='B'; //Se declara una variable de tipo caracter llamnadola x
	int ascii = (int) X; //Se convierte a entero lo contenido en x char y se almacena en ascii
	System.out.println("El codigo Ascii de "+x+" es = "+ascii); //Se imprime el numero ascii
	}}