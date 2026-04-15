package colasconprioridad;

public class FilaCajero implements ColaPrioridadTDA<Integer>{

    private int cantidad;
    private int[] datos;
    private int[] prioridades;
    private static final int MAX=100;


    @Override
    public void InicializarColaPrioridad(){
        cantidad = 0;
        datos = new int[MAX];
        prioridades = new int[MAX];
    }

    @Override
    public void AcolarPrioridad(Integer numero , int prioridad){
        if (cantidad<MAX){
            int i=cantidad-1;
            while (i >= 0 && prioridades[i] < prioridad) {
                prioridades[i+1]=prioridades[i];
                datos[i+1]=datos[i];
                i--;
            }
            prioridades[i+1]=prioridad;
            datos[i+1]=numero;
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
    public boolean ColaVacia(){
        return cantidad==0;
    }

    @Override
    public Integer Primero(){
        return datos[0];
    }

    @Override
    public int Prioridad(){
        return prioridades[0];
    }


}
