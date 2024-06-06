package Ejercicio1;


public class Mago extends Criatura{

    private final int nivelMagico;

    public Mago(String nombre, int edad, int nivelMagico) {
        super(nombre, edad);
        this.nivelMagico = nivelMagico;
    }

    @Override
    void realizarAccion() {
        if(nivelMagico >= 50){
            System.out.println("[Gandalf] Lanza un poderoso hechizo");
        }else{
            System.out.println("[Gandalf] Genera una pequeña chispa");
        }
        super.realizarAccion();
    }
}
