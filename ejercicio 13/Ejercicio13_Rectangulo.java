//Marco Carrera
//16-02-19
//4:14-4:40



	import java.util.Scanner; //importamos la libreria scanner para ingresar los numeros desde teclado
	
	class Ejercicio13_Rectangulo{
    	
	public static void main(String[] Args){
        
	Scanner entrada=new Scanner(System.in); 
        

	System.out.println("Ingrese la altura"); 
        double altura=entrada.nextDouble(); //se ingresa un numero cualquiera
        
	System.out.println("Ingrese la base"); 
        double base=entrada.nextDouble(); //Se ingresa un numero cualquiera
        

	System.out.println("El area del rectangulo es: "+((base*altura)/2)); //lanza el area de nuestro rectangulo
        System.out.println("El perimetro del rectangulo es: "+((base+altura)*2)); //lanza el perimetro de nuestro rectangulo
	}
	}