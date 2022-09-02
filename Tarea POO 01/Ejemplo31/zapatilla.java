class zapatilla
{


    String marca;
    String color;
    int talla;


    public static void main(String[] args)
    {
        zapatilla zapatilla = new zapatilla();

        zapatilla.marca = "nike";
        zapatilla.color = "negro";
        zapatilla.talla = 40;

        System.out.println(zapatilla);

        System.out.println("la marca es: "+zapatilla.marca);

        System.out.println("el color es: "+zapatilla.color);

        System.out.println("la talla es: "+zapatilla.talla);

    }

}