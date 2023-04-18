public abstract class Animal implements Comparable<Animal> {
    protected String nombre;

    protected int edad;

    protected float peso;

    ///region Constructor

    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    ///endregion

    ///region G y S

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    ///endregion


    @Override
    public String toString() {
        return  nombre + " de " + edad + " años " + peso + "kg";
    }
}
