package tarea01;

class Escuela 	{

	 String direccion;
	 int aula;
	 int codigo;


public static void main(String[] args)
	{
		Escuela escuela = new Escuela();

		 escuela.direccion = "jr. escuelita 122";
		 escuela.aula = 12;
		 escuela.codigo = 14235648;

		System.out.println(escuela);

		System.out.println("direccion: "+escuela.direccion);

		System.out.println("numero de aulas: "+escuela.aula);

		System.out.println("codigo:  "+escuela.codigo);

	}

}