package Ejemplo3;

class Dado

{

	String color;
	float tamano;
	float caras;


public static void main(String[] args)
	{
		Dado dado = new Dado();

		 dado.color = "rojo";
		 dado.tamano = 2;
		 dado.caras = 6;

		System.out.println(dado);

		System.out.println("el color es: "+dado.color);

		System.out.println("el tamano en cm es: "+dado.tamano);

		System.out.println("el numero de caras es: "+dado.caras);

	}

}
