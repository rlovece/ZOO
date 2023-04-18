public class Perro extends Animal{

    private String raza;

    ///region Constructor
    public Perro(String nombre, int edad, float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }
    ///endregion

    ///region G y S
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
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
