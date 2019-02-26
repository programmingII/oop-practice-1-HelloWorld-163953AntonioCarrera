//Marco Carrera
//23-02-19
//11:33



	import java.util.Scanner; //Se importa la libreria que permite que ingresemos mas numeros
	class Ejercicio33_SumaEnteros{
	public static void main(String[] args){
		
	Scanner Num = new Scanner (System.in); //Se crea un objeto llamado num para el lmacenamiento de datos
	int x, sum=0; //declarmos 2 variables de tipo entero,a sum le asignamos ya un valor en este caso es 0
	System.out.println("por favor ingresa solo numeros enteros"); //Se pide ingresar numeros enteros solamente
	x = Num.nextInt(); //almacena el numero en la variable entera x

	
	while(x!=0){ //creamos un ciclo while funcionara siempre y cuando x sea diferente de 0	
	sum = sum + (x % 10); //En la variable sum se almacena el resultado de sum mas el residuo de dividir el numero entre 10, del cual solo se almacena el numero entero
	x = x /10; //en la variable x se almacena el resultado de x entre 10
	}
	System.out.println("La suma de los digitos es: "+sum); // resultado de la suma
	}}