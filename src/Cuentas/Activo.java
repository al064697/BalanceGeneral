package Cuentas;

import java.util.ArrayList;
public class Activo extends Cuenta {

    // Métodos para calcular el total de activos circulantes, fijos y diferidos
    double Circulante() {
        ArrayList<Cuenta> activoCirculante = crearCuentas("Caja", "Bancos", "Inversiones temporales",
                "Mercancias", "Clientes", "Documentos por cobrar", "Deudores diversos", "Anticipo a proveedores");

        return super.cuenta(activoCirculante, "Circulante");
    }

    double Fijo() {
        ArrayList<Cuenta> activoFijo = crearCuentas("Terrenos", "Edificios", "Mobiliario y equipo",
                "Equipo de computo", "Equipo de entrega y reparto", "Depositos en garantia", "Inversiones temporales",
                "Documentos por cobrar a largo plazo");

        return cuenta(activoFijo, "Fijo");
    }

    double Diferido() {
        ArrayList<Cuenta> activoDiferido = crearCuentas("Gastos de investigacion y desarrollo",
                "Gastos en etapas preoperativas de organizacion y administracion", "Gastos de mercadotecnia",
                "Gastos de organizacion", "Gastos de instalacion", "Papeleria y utiles", "Propaganda y publicidad",
                "Primas de seguros", "Rentas pagadas por anticipado", "Intereses pagados por anticipado");

        return cuenta(activoDiferido, "Diferido");
    }

    // Método para calcular el total del activo
    public double totalActivo() {
        //return Circulante() + Fijo() + Diferido();
        Activo activo = new Activo();
        double total = Circulante() + Fijo() + Diferido();
        System.out.println("Total activo $" + total);
        return total;
    }


/*    public static void main(String[] args) {
        System.out.println("Activo");
        Activo activo = new Activo();

        System.out.println("Total del activo: $" + total);
    }*/
}