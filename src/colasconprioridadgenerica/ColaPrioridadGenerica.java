package colasconprioridadgenerica;

public interface ColaPrioridadGenerica<T> {

    void InicializarColaPrioridad();

    void AcolarPrioridad(T numero, int prioridad);

    void Desacolar();

    boolean ColaVacia();

    T Primero();

    int Prioridad();
}
