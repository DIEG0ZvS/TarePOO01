package clase01;

class Yogurt

{

	int codigo;
	String sabor;
	String nombre;


public static void main(String[] args)
	{
		Yogurt yogurt = new Yogurt();

		 yogurt.codigo = 11100;
		 yogurt.sabor = "fresa";
		 yogurt.nombre = "gloria";

		System.out.println(yogurt);

		System.out.println("el codigo es: "+yogurt.codigo);

		System.out.println("el sabor es: "+yogurt.sabor);

		System.out.println("la marca es: "+yogurt.nombre);

	}

}