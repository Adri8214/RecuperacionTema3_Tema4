package Ejercicio1;

public class Elfo extends Criatura{
    public Elfo(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void realizarAccion() {
        System.out.println("[Fernando Alonso] Dispara una flecha mágica");
        super.realizarAccion();
    }
}
