package tarea01;

class Libreria	{

	 String direccion;
	 String nombre;
	 int cuartos;


public static void main(String[] args)
	{
		Libreria libreria = new Libreria();

		 libreria.direccion = "jr. Abancay 113";
		 libreria.nombre = "librotito";
		 libreria.cuartos = 6;

		System.out.println(libreria);

		System.out.println("nombre: "+libreria.nombre);

		System.out.println("direccion: "+libreria.direccion);

		System.out.println("cuartos: "+libreria.cuartos);

	}

}