package Cuentas;

import java.util.Scanner;
import java.util.ArrayList;
public class CuentaActivo {
    Scanner src = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

    // Método para crear una lista de cuentas a partir de una lista de nombres
    ArrayList<Cuenta> crearCuentas(String... nombres) {
    /*NOTA: El parámetro del método (String... nombres) es un parámetro varargs, lo que significa que puedes pasar
            cualquier número de argumentos String al método, y se tratarán como un array */

        ArrayList<Cuenta> cuentas = new ArrayList<>(); // Crear una nueva lista vacía para almacenar las cuentas


        for (int i = 0; i < nombres.length; i++) { // Recorrer cada nombre en la lista de nombres

            // Crear una nueva cuenta con el índice actual (i+1) como ID y el nombre actual como nombre
            // Luego, agregar esta nueva cuenta a la lista de cuentas
            cuentas.add(new Cuenta(i + 1, nombres[i]));
        }
        return cuentas;// Devolver la lista completa de cuentas
    }


    // Método para calcular el total de una lista de cuentas
    double cuentaActivo(ArrayList<Cuenta> cuentas, String tipo) {
        System.out.println(tipo); // Imprimir el tipo de cuenta

        // Leer los valores de las cuentas del usuario
        double[] valores = new double[cuentas.size()];
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.print(cuentas.get(i).getNombre() + " $");
            valores[i] = src.nextDouble();
        }

        // Crear una nueva lista con las cuentas que no están vacías
        ArrayList<Cuenta> cuentasNoVacias = new ArrayList<>();
        double total = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            if (valores[i] != 0) {
                cuentasNoVacias.add(cuentas.get(i));
                total += valores[i];
            }
        }

        // Imprimir el total de la cuenta
        System.out.println("Total " + tipo.toLowerCase() + " $" + total);
        return total;
    }

    // Métodos para calcular el total de activos circulantes, fijos y diferidos
    double cuentaActivoCirculante() {
        ArrayList<Cuenta> activoCirculante = crearCuentas("Caja", "Bancos", "Inversiones temporales",
                "Mercancias", "Clientes", "Documentos por cobrar", "Deudores diversos", "Anticipo a proveedores");

        return cuentaActivo(activoCirculante, "Circulante");
    }

    double cuentaActivoFijo() {
        ArrayList<Cuenta> activoFijo = crearCuentas("Terrenos", "Edificios", "Mobiliario y equipo",
                "Equipo de computo", "Equipo de entrega y reparto", "Depositos en garantia", "Inversiones temporales",
                "Documentos por cobrar a largo plazo");

        return cuentaActivo(activoFijo, "Fijo");
    }

    double cuentaActivoDiferido() {
        ArrayList<Cuenta> activoDiferido = crearCuentas("Gastos de investigacion y desarrollo",
                "Gastos en etapas preoperativas de organizacion y administracion", "Gastos de mercadotecnia",
                "Gastos de organizacion", "Gastos de instalacion", "Papeleria y utiles", "Propaganda y publicidad",
                "Primas de seguros", "Rentas pagadas por anticipado", "Intereses pagados por anticipado");

        return cuentaActivo(activoDiferido, "Diferido");
    }

    // Método para calcular el total del activo
    double totalActivo() {return cuentaActivoCirculante() + cuentaActivoFijo() + cuentaActivoDiferido();}

    public static void main(String[] args) {
        System.out.println("Activo");
        CuentaActivo activo = new CuentaActivo();
        double total = activo.totalActivo();
        System.out.println("Total del Activo: $" + total);
    }
}