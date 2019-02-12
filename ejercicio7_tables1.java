/*Marco Carrera
10-02-19
1:30*/


import java.util.Scanner; 
//permite ingresar datos desde la consola
	
	class ejercicio7_tables1{	
	

	public static void main  (String[] args)  {
	Scanner in = new Scanner (System.in);

	System.out.print ("Ingresa el numero del cual quieras desarrollar su tabla");//me pide ingresar el numero
	int num1=in.nextInt();

	for (int i=0; i< 10; i++){   //me permite ejecutar este segmento las veces que guste
   	System.out.println (num1 + "x" + (i+1) + "=" + //arroja la tabla solicitada
        (num1 * (i+1)));
  	
	}
	}
 	}
	
	

//1:47