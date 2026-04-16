package diccionarioSimple;

public interface DiccionarioSimpleTDA<K, V> {
    void InicializarDiccionario();
    void Agregar(K clave, V valor);
    void Eliminar(K clave);
    K[] Claves();
}