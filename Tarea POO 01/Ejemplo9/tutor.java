package tarea01;

class Tutor 	{

	 String curso;
	 String nombre;
	 int dni;


public static void main(String[] args)
	{
		Tutor tutor = new Tutor();

		 tutor.nombre = "julio profe";
		 tutor.curso = "Matematica 99";
		 tutor.dni = 14235648;

		System.out.println(tutor);

		System.out.println("nombre: "+tutor.nombre);

		System.out.println("curso a cargo: "+tutor.curso);

		System.out.println("dni: "+tutor.dni);

	}

}