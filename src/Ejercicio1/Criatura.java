package Ejercicio1;

public class Criatura {

    private String nombre;
    private int edad;
    private int nivelEnergia;

    public Criatura(String nombre, int edad) throws RuntimeException {
        this.nombre = nombre;
        if(this.nombre != nombre){
            throw new RuntimeException("El nombre no es correcto");
        }
        this.edad = edad;
        if(edad != this.edad){
            throw new RuntimeException("La edad no es correcta");
        }
    }

     void realizarAccion(){

     }


}
