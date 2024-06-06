package Ejercicio1;

public class HombreLobo extends Criatura{
    public HombreLobo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void realizarAccion() {
        System.out.println("[Wolverine] aúlla a la luna");
        super.realizarAccion();
    }
}
