package Ejemplo2;

class Carnet

{

	String nombre;
	int edad;
	float tamano;


public static void main(String[] args)
	{
		Carnet carnet = new Carnet();

		 carnet.nombre = "nilson";
		 carnet.edad = 18;
		 carnet.tamano = 120;

		System.out.println(carnet);

		System.out.println("el nombre es: "+carnet.nombre);

		System.out.println("la edad es: "+carnet.edad);

		System.out.println("el tamano es: "+carnet.tamano);

	}

}
