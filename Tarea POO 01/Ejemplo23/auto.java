class auto
{

    int ano;
    String marca;
    String color;


    public static void main(String[] args)
    {
        auto auto = new auto();

        auto.marca = "toyota";
        auto.color = "rojo";
        auto.ano = 2010;


        System.out.println(auto);

        System.out.println("el ano de fabricacion es: "+auto.ano);

        System.out.println("la marca es: "+auto.marca);

        System.out.println("el color es: "+auto.color);

    }

}