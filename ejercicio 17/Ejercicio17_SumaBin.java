//Marco Carrera
//17-02-19
//3:42-3:52



	import java.util.Scanner; //se importa la libreria para ingresar datos

	class Ejercicio17_SumaBin{

    	public static void main(String[] args) {

        Scanner bin=new Scanner(System.in); //creamos un objeto scanner para almacenamiento de los datos
	String b1, b2, sum; //declaramos tres variables de tipo string

	System.out.println("Ingresa dos numeros binarios"); //Se pide al usuario que ingrese dos cadenas de binarios
	b1=bin.nextLine(); //Se almacena el primer binario en la variable b1
	b2=bin.nextLine(); //Se almacena el segundo binario en la variable b2

	sum=(Integer.toBinaryString(Integer.parseInt(b1, 2)+Integer.parseInt(b2, 2)));
	//aqui utilizo la clase integer vista en una clase anterior,seguido de dos objetos pertenecientes a esta clase,
	//parseInt cambia a enteros y se sumara,toBinaryString lo convertira a binario


	System.out.println(""+b1+" + "+b2+" = "+sum); //aqui nos arroja el resultado de nuestra suma
        }
	}