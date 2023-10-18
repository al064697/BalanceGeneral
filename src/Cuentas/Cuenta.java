package Cuentas;

public class Cuenta {
    int id;
    String nombre;
    int totalCuenta;

    Cuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public void setTotalCuenta(int totalCuenta) {this.totalCuenta = totalCuenta;}
    @Override public String toString() {return  id + nombre;}
}
