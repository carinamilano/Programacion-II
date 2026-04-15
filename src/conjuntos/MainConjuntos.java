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


    }
}
