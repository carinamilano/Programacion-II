package colas;

public class BuffetFacu implements ColaTDA<Integer>{

    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    @Override
    public void InicializarCola(){
        datos = new int[MAX];
        cantidad = 0;
    }

    @Override
    public void Acolar (int x){
        if (cantidad < MAX){
            datos[cantidad] = x;
            cantidad++;
        }
    }

    @Override
    public void Desacolar(){
        if (!ColaVacia()){
            for (int i=0; i<cantidad-1; i++){
                datos[i]=datos[i+1];
            }
            cantidad--;

        }
    }
    @Override
    public Integer Primero(){
        return datos[0];
    }

    @Override
    public boolean ColaVacia(){
        return cantidad == 0;
    }



}
