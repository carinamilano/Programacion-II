package colasconprioridadgenerica;

public class MainColasPrioridad {
    public static void main(String[] args) {

        FilaCajero fila = new FilaCajero();
        fila.InicializarColaPrioridad();

        // Acolamos 3 personas
        System.out.println("Llegan al banco:  \npersona 1 (prioridad 1) / persona 2 (prioridad 5) / persona 3 (prioridad 10)");
        fila.AcolarPrioridad(1, 1);
        fila.AcolarPrioridad(2, 5);
        fila.AcolarPrioridad(3, 10); //la persona que llego 3era es la de mayor prioridad

        // Mostramos cómo salen del banco!!
        while (!fila.ColaVacia()) {
            System.out.println("Atendiendo persona: " + fila.Primero() +
                    " con prioridad: " + fila.Prioridad());
            fila.Desacolar();
        }
    }
}
