package conjuntosgenericos;

public interface ConjuntoGenerico<T> {
    void InicializarConjunto();
    void Agregar(T valorAAgregar);
    void Sacar(T valorASacar);
    boolean ConjuntoVacio();
    boolean Pertenece(T valorABuscar);
    T Elegir();
}
