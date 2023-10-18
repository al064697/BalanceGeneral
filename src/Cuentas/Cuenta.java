package Cuentas;

public class Cuenta {
    private int id;
    private String nombre;

    public Cuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public String getNombre() {return nombre;}
    @Override public String toString() {return  id + ".- " + nombre + '\n';}
}
