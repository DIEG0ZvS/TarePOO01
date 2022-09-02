package Ejemplo3;

class Zapatillas

{

	int talla;
	String color;
	String marca;


public static void main(String[] args)
	{
		Zapatillas zapatillas = new Zapatillas();

		 zapatillas.talla = 41;
		 zapatillas.color = "negro";
		 zapatillas.marca = "Convers";

		System.out.println(zapatillas);

		System.out.println("la talla es: "+zapatillas.talla);

		System.out.println("el color es: "+zapatillas.color);

		System.out.println("la marca es: "+zapatillas.marca);

	}

}
