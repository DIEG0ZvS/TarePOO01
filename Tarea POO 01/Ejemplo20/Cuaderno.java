package Ejemplo4;

class Cuaderno

{

	String marca;
	String color;
	String codigo;


public static void main(String[] args)
	{
		Cuaderno cuaderno = new Cuaderno();

		 cuaderno.marca = "Artesco";
		 cuaderno.color = "Azul";
		 cuaderno.codigo = "02024";

		System.out.println(cuaderno);

		System.out.println("la marca es: "+cuaderno.marca);

		System.out.println("el color es: "+cuaderno.color);

		System.out.println("el codigo es: "+cuaderno.codigo);

	}

}
