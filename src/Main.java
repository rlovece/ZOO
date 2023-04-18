import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Perro p1 = new Perro("Pepa", 3, 15.5f, "pp");
        Perro p2 = new Perro("Rocki", 10, 20f, "pp");
        Perro p3 = new Perro("Pumba", 1, 12f, "pp");

        Gato g1 = new Gato("Michu", 2, 2f, "blanco y negro");

        ArrayList<Animal>  listaAnimales = new ArrayList<Animal>();

        listaAnimales.add(p1);
        listaAnimales.add(p2);
        listaAnimales.add(p3);
        listaAnimales.add(g1);

        Consola.escribir("\n La lista de animales: " + listaAnimales.toString());

        Collections.sort(listaAnimales);

        Consola.escribir("\n La lista de animales ORDENADA por peso: " + listaAnimales.toString());



    }
}