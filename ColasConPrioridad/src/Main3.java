public class Main3 {
    public static void main(String[] args) {

        FilaCajero fila = new FilaCajero();
        fila.InicializarColaPrioridad();

        // Acolamos 3 personas
        System.out.println("Llega al banco la persona 1 con prioridad 1");
        fila.AcolarPrioridad(1, 1);
        System.out.println("Llega al banco la persona 2 con prioridad 5");
        fila.AcolarPrioridad(2, 5);
        System.out.println("Llega al banco la persona 3 con prioridad 10");
        fila.AcolarPrioridad(3, 10); //la persona que llego 3era es la de mayor prioridad

        // Mostramos cómo salen del banco!!
        while (!fila.ColaVacia()) {
            System.out.println("Atendiendo persona: " + fila.Primero() +
                    " con prioridad: " + fila.Prioridad());
            fila.Desacolar();
        }
    }
}
