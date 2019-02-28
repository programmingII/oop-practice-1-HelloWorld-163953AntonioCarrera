//Marco Carrera
//24-02-19
//9:34


	class Ejercicio39_Tnumeros{
	public static void main(String [] args){
	int cNum = 0; //declaro un contador de tipo entero y se iniciaen cero
	
	
	for (int a=1; a<=4;a++){ 
	for (int b=1; b<=4;b++){
	for (int c=1; c<=4;c++){ //utilizamos ciclos for por que son combinaciones de 4 numeros
	

	if (c!=a && c!=b && a!=b){ //Como son combinaciones y no se pueden repetir se revisa con este ciclo que no sean iguales 
	cNum++;	//incrementamos uno al contador	 
	System.out.println (a+""+b+""+c); //nos da cada combinacion posible
	}}}}
	System.out.println ("Combinaciones: "+cNum); 
	}
	}