package Ejemplo24;

public class Alumno {
    public int codigo = 2020210324;         //El "public" no afecta en nada lo que afecta es el "private"

    public String nombre = "Aaron Friedrich Teodor Pilco";
    public int dni = 75360891;

    public int mostrarCodigo()
    {

        return codigo;
    }

    public String mostrarNombre()
    {

        return nombre;
    }

    public int mostrarDni()
    {

        return dni;
    }
}
