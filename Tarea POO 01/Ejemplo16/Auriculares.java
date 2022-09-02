package Ejemplo4;

class Auriculares

{

	String color;
	String marca;
	float peso;


public static void main(String[] args)
	{
		Auriculares auriculares = new Auriculares();

		 auriculares.color = "negro";
		 auriculares.marca = "gamer";
		 auriculares.peso = 123;

		System.out.println(auriculares);

		System.out.println("el color es: "+auriculares.color);

		System.out.println("la marca es: "+auriculares.marca);

		System.out.println("el peso es: "+auriculares.peso);

	}

}
