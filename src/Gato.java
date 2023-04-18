public class Gato extends Animal{

    private String pelaje;

    ///region Constructor

    public Gato(String nombre, int edad, float peso, String pelaje) {
        super(nombre, edad, peso);
        this.pelaje = pelaje;
    }
    ///endregion

    ///region G y S
    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }
    ///endregion

    @Override
    public int compareTo(Animal o) {
        if (this.peso < o.getPeso()){
            return -1;
        } else if (this.peso > o.getPeso()){
            return 1;
        } else {
            return 0;
        }
    }
}
