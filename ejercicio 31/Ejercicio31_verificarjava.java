//Marco Carrera
//23-02-19
//11:00

	
	class Ejercicio31_verificarjava {
	public static void main(String[] args) {
        

	System.out.println("\nJava Version: "+System.getProperty("java.version")); //utilizamos el metodo getProperty que esta vinculado a la clase system
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");
	}}