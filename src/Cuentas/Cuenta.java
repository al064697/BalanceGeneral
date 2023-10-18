package Cuentas;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuenta {
    private int id;
    private String nombre;
    Scanner src = new Scanner(System.in);

    public Cuenta() {

    }

    public Cuenta(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return  id + ".- " + nombre + '\n';
    }

    // Método para crear una lista de cuentas a partir de una lista de nombres
    public ArrayList<Cuenta> crearCuentas(String... nombres) {
    /* NOTA: El parámetro del método (String... nombres) es un parámetro varargs, lo que significa que puedes pasar
            cualquier número de argumentos String al método, y se tratarán como un array */
        ArrayList<Cuenta> cuentas = new ArrayList<>(); // Crear una nueva lista vacía para almacenar las cuentas
        for (int i = 0; i < nombres.length; i++) {
            // Crear una nueva cuenta con el índice actual (i+1) como ID y el nombre actual como nombre
            // Luego, agregar esta nueva cuenta a la lista de cuentas
            cuentas.add(new Cuenta(i + 1, nombres[i]));
        }
        return cuentas;
    }

    // Método para calcular el total de una lista de cuentas
    double cuenta(ArrayList<Cuenta> cuentas, String tipo) {
        System.out.println(tipo); // Imprimir el tipo de cuenta
        double[] valores = new double[cuentas.size()]; // Leer los valores de las cuentas del usuario
        ArrayList<Cuenta> cuentasNoVacias = new ArrayList<>(); // Crear una nueva lista con las cuentas que no están vacías
        double total = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.print(cuentas.get(i).getNombre() + " $"); valores[i] = src.nextDouble();
        }
        for (int i = 0; i < cuentas.size(); i++) {
            if (valores[i] != 0) {
                cuentasNoVacias.add(cuentas.get(i)); total += valores[i];
            }
        }
        System.out.println("Total " + tipo.toLowerCase() + " $" + total); // Imprimir el total de la cuenta
        return total;
    }
}
