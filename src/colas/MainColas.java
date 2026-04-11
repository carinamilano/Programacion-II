package colas;

public class MainColas {
    public static void main(String[] args) {

        BuffetFacu bufet = new BuffetFacu();
        bufet.InicializarCola();

        System.out.println("**********Buffet de la Facultad********");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(1);
        System.out.println("Persona 1 se pone en la fila");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(2);
        System.out.println("Persona 2 se pone en la fila");
        System.out.println("Llega una persona a la fila!!");
        bufet.Acolar(3);
        System.out.println("Persona 3 se pone en la fila");
        //se atiende al primero que llego
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        System.out.println("Se atiende a la persona: " + bufet.Primero());
        bufet.Desacolar();
        if (bufet.ColaVacia()){
            System.out.println("no hay mas gente en la fila");
        }


    }
}
