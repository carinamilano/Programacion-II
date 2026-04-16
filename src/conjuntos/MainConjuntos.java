package conjuntos;

public class MainConjuntos {
    public static void main (String[] args){
        TagsDeBlogs tagsDeBlogs = new TagsDeBlogs();
        tagsDeBlogs.InicializarConjunto();
        System.out.println("*************TagsDeBlogs**************");
        System.out.println("Agrego etiqueta #Programacion");
        tagsDeBlogs.Agregar("#Programacion");
        System.out.println("Agrego etiqueta #Programacion");
        tagsDeBlogs.Agregar("#Programacion");
        System.out.println("Agrego etiqueta #Java");
        tagsDeBlogs.Agregar("#Java");
        System.out.println("Agrego etiqueta #OOP");
        tagsDeBlogs.Agregar("#OOP");
        System.out.println("Agrego etiqueta #OOP");
        tagsDeBlogs.Agregar("#OOP");
        System.out.println("Las etiquetas nombradas en este post son:" );
        tagsDeBlogs.mostrar();

        System.out.println("*************TagsDeBlogs**************");

        Legajos legajos = new Legajos();
        legajos.InicializarConjunto();

        legajos.Agregar(1001);
        System.out.println("Se agregó el legajo 1001");

        legajos.Agregar(1002);
        System.out.println("Se agregó el legajo 1002");

        legajos.Agregar(1003);
        System.out.println("Se agregó el legajo 1003");

        legajos.Agregar(1002);
        System.out.println("Intenté agregar nuevamente el legajo 1002");

        System.out.println("Legajos en el conjunto:");
        legajos.mostrar();
    }
}
