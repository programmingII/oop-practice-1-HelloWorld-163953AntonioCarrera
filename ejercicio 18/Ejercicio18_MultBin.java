
//Marco Carrera
//17-02-19
//4:00-4:10


	import java.util.Scanner; //se importa la libreria para ingresar datos

	class Ejercicio18_MultBin{

    	public static void main(String[] args) {

        Scanner bin=new Scanner(System.in); //creamos un objeto scanner para almacenamiento de los datos
	String x1, x2, prod; //declaramos tres variables de tipo string

	System.out.println("Ingresa dos numeros binarios"); //Se pide al usuario que ingrese numeros binarios
	x1=bin.nextLine(); //Se almacena el primer binario en la variable x1
	x2=bin.nextLine(); //Se almacena el segundo binario en la variable x2

	prod=(Integer.toBinaryString(Integer.parseInt(x1, 2)+Integer.parseInt(x2, 2)));
	//aqui utilizo la clase integer vista en una clase anterior,seguido de dos objetos pertenecientes a esta clase,
	//parseInt cambia a enteros y se sumara,toBinaryString lo convertira a binario


	System.out.println(""+x1+" * "+x2+" = "+prod); //aqui nos arroja el resultado de nuestra multiplicacion
        }
	}