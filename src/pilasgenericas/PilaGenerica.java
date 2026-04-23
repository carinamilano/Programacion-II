package pilasgenericas;

public interface PilaGenerica<T> {

    void InicializarPila();

    void Apilar(T valorAApilar);

    void Desapilar();

    T Tope();

    boolean PilaVacia();
}
