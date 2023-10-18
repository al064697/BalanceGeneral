package Cuentas;

import java.util.ArrayList;

public class Pasivo extends Cuenta {
    // Métodos para calcular el total de activos circulantes, fijos y diferidos
    double flotante() {
        ArrayList<Cuenta> activoCirculante = crearCuentas("Proveedores", "Documentos por pagar",
                "Acreedores diversos", "Anticipo de clientes",
                "Gastos pendientes de pago, gastos por pagar o gastos acumulados",
                "Impuestos pendientes de pago, impuestos por pagar o impuestos acumulados");

        return cuenta(activoCirculante, "Flotante");
    }

    double fijo() {
        ArrayList<Cuenta> activoFijo = crearCuentas("Hipotecas por pagar o acreedores hipotecarios",
                "Documentos por pagar a largo plazo", "Cuentas por pagar a largo plazo");

        return cuenta(activoFijo, "Fijo");
    }

    double creditosDiferidos() {
        ArrayList<Cuenta> activoDiferido = crearCuentas("Rentas cobradas por anticipado",
                "Intereses cobrados por anticipado");

        return cuenta(activoDiferido, "Crédito diferido");
    }

    // Método para calcular el total del activo
    public double totalPasivo() {
        //return flotante() + fijo() + creditosDiferidos();
        Pasivo pasivo = new Pasivo();
        double total = flotante() + fijo() + creditosDiferidos();
        System.out.println("Total pasivo $" + total);
        return total;
    }
}
