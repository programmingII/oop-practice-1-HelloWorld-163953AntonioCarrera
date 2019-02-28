//Marco Carrera
//24-02-19
//9:08


import java.util.Scanner; //Se importa la libreria Scanner que permite almacenamiento de datos

class Ejercicio36_Distancia{
	public static void main (String[] args){
	Scanner x = new Scanner (System.in);

double lat1,lat2,lon1,lon2, d, r=6371.01; //declaramos un total de seis variables la ultima llamada r la inicializamos con un valor 

System.out.println("Ingresa latitud 1"); //ingresamos primer dato
	lat1 = x.nextDouble(); //almacenamos el primer dato 

System.out.println("Ingresa longitud 1"); //ingresamos el segundo dato
	lon1 = x.nextDouble(); //almacenamos el segundo dato

System.out.println("Ingresa latitud 2"); //ingresamos el tercer dato
	lat2 = x.nextDouble(); //almacenamos el tercer dato

System.out.println("Ingresa longitud 2"); //ingresamos el cuarto dato
	lon2 = x.nextDouble(); //almacenamos el cuarto dato

lat1 = Math.toRadians(lat1); //convertimos a radianes para utilizar trigonometria
lat2 = Math.toRadians(lat2); //convertimos a radianes para utilizar trigonometria
lon1 = Math.toRadians(lon1); //convertimos a radianes para utilizar trigonometria
lon2 = Math.toRadians(lon2); //convertimos a radianes para utilizar trigonometria

	d = r * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2)); //Se resuelve y se almacena en nuetra variable a la que llamamo d
	System.out.println("La distancia es = "+d); //no arroja el resultado 
	}}