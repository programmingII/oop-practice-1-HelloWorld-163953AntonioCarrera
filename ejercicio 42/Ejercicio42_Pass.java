//Marco Carrera
//24-02-19
//6-09


	import java.util.Scanner; //importamos la libreria de almacenamiento de datos
	
	class Ejercicio42_Pass{
	public static void main (String[] args){
	Scanner con=new Scanner (System.in);
	String pass="programacion", access;
	int x=0; //declaramos una variable de tipo entero y asignamos el valos de cero

	do{
	
	System.out.println ("Ingresa tu contraseña"); //pedimos el ingreso de la contraseña
	access=con.nextLine ();

	if (access==pass){
	x=1;
	}
	else {
	x=0;
	}
	}
	while (x==1);
	}}

	