package Cuentas;

public class Cuenta {
    int id;
    String nombre;
    Cuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    @Override public String toString() {return  id + nombre;}
}
