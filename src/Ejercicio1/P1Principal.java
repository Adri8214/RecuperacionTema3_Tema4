package Ejercicio1;

public class P1Principal {
    public static void main(String[] args) {

        Criatura d1 = new Dragon("Spyro", 40);

        d1.realizarAccion();
        ((Dragon) d1).volar();

        System.out.println("------------------------------------------");

        Criatura e1 = new Elfo("Fernando Alonso", 54);

        e1.realizarAccion();

        System.out.println("------------------------------------------");

        Criatura h1 = new HombreLobo("Wolverine", 23);

        h1.realizarAccion();

        System.out.println("------------------------------------------");

        Criatura m1 = new Mago("Gandalf", 200, 400);

        m1.realizarAccion();

    }
}
