package colasgenerica;

public interface ColaGenerica<T> {
    void InicializarCola();
    void Acolar(int x);
    void Desacolar();
    T Primero();
    boolean ColaVacia();
}
