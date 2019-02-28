//Marco Carrera
//24-02-19
//10:42


	import java.nio.charset.Charset; //Se importa la libreria Charsetesta contiene todos los charset estandar
	class Ejercicio40_CharsetObjects{
	public static void main(String [] args){	
	System.out.println (" caracteres disponibles en charset objetos "); //Se imprime en pantalla que es lo que se va a mostrar
	
	for (String str : Charset.availableCharsets ().keySet ()){ //lo colocamos dentro de un ciclo for que finalizara cuando ya no haya nada que mostrar
	System.out.println (str); //nos arroja el contenido de str de tipo string
	}}}