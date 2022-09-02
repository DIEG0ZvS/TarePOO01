package tarea01;

class Auto
{
	String color = "blanco";
	String marca = "Carl Friedrich Gauss";
	String placa = "43A";



public static void main(String[] args)
	{
		Auto auto = new Auto();

		auto.color = "blanco";

		auto.marca = "Carl Friedrich Gauss";

		auto.placa = "43A";

		System.out.println(auto);

		System.out.println("placa: "+auto.placa);

		System.out.println("marca: "+auto.marca);

		System.out.println("color: "+auto.color);

	}

}