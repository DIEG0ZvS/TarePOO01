package tarea01;

class Curso	{

	 String nombre;
	 int ciclo;
	 int inscritos;


public static void main(String[] args)
	{
		Curso curso = new Curso();

		curso.nombre = "Programacion Orientada a Objetos";

		curso.ciclo =5;

		curso.inscritos = 55;

		System.out.println(curso);

		System.out.println("nombre: "+curso.nombre);

		System.out.println("ciclo: "+curso.ciclo);

		System.out.println("inscritos: "+curso.inscritos);

	}

}