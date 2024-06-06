package Ejercicio1;

public class Dragon extends Criatura implements Volar{
    public Dragon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void realizarAccion() {
        System.out.println("[Spyro] escupe fuego");
        super.realizarAccion();
    }

    @Override
    public void volar() {
        System.out.println("[Spyro] vuela ágilmente sobre los árboles");
    }
}
