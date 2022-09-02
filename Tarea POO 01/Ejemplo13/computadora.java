package clase01;

class Computadora

{

	String procesador;
	String sistemaOperativo;
	String ram;


public static void main(String[] args)
	{
		Computadora computadora = new Computadora();

		 computadora.procesador = "AMD 3600";
		 computadora.sistemaOperativo = "windows";
		 computadora.ram = "32gb";

		System.out.println(computadora);

		System.out.println("el procesador es: "+computadora.procesador);

		System.out.println("el sistema operativo es: "+computadora.sistemaOperativo);

		System.out.println("la memoria ram es de: "+computadora.ram);

	}

}