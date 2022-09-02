class cliente

{

    int telefono;
    String nombre;
    String ciudad;


    public static void main(String[] args)
    {
        cliente cliente = new cliente();

        cliente.telefono = 997664888;
        cliente.nombre = "juan";
        cliente.ciudad = "lima";

        System.out.println(cliente);

        System.out.println("el telefono es: "+cliente.telefono);

        System.out.println("el nombre es: "+cliente.nombre);

        System.out.println("la ciudad es: "+cliente.ciudad);

    }
}
