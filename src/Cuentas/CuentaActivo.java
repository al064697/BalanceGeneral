package Cuentas;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaActivo {
    Scanner src = new Scanner(System.in);
    private int totalActivosCirculantes, totalActivosFijo, totalActivosDiferidos, totalActivo;


    void cuentaActivoCirculante() {
        int valCaja = src.nextInt(), valBancos = src.nextInt(), valInversionesTemp = src.nextInt(),
                valMercan = src.nextInt(), valClientes = src.nextInt(), valDocsCobrar = src.nextInt(),
                valDeudores = src.nextInt(), valAnticipoProveedores = src.nextInt();

        ArrayList<Cuenta> activoCirculante = new ArrayList<>();
        activoCirculante.add(new Cuenta(1, "Caja"));
        activoCirculante.add(new Cuenta(2, "Bancos"));
        activoCirculante.add(new Cuenta(3, "Inversiones temporales"));
        activoCirculante.add(new Cuenta(4, "Mercancias"));
        activoCirculante.add(new Cuenta(5, "Clientes"));
        activoCirculante.add(new Cuenta(6, "Documentos por cobrar"));
        activoCirculante.add(new Cuenta(7, "Deudores diversos"));
        activoCirculante.add(new Cuenta(8, "Anticipo a proveedores"));

        if(Integer.toString(valCaja).equals(" ")) {activoCirculante.remove(0);}
        if(Integer.toString(valBancos).equals(" ")) {activoCirculante.remove(1);}
        if(Integer.toString(valInversionesTemp).equals(" ")) {activoCirculante.remove(2);}
        if(Integer.toString(valMercan).equals(" ")) {activoCirculante.remove(3);}
        if(Integer.toString(valClientes).equals(" ")) {activoCirculante.remove(4);}
        if(Integer.toString(valDocsCobrar).equals(" ")) {activoCirculante.remove(5);}
        if(Integer.toString(valDeudores).equals(" ")) {activoCirculante.remove(6);}
        if(Integer.toString(valAnticipoProveedores).equals(" ")) {activoCirculante.remove(7);}

        totalActivosCirculantes = valCaja + valBancos + valInversionesTemp + valMercan + valClientes + valDocsCobrar
                + valDeudores + valAnticipoProveedores;
    }

    void cuentaActivoFijo() {
        int valTerrenos = src.nextInt(), valEdificios = src.nextInt(), valMobiliario = src.nextInt(),
                valComputo = src.nextInt(), valReparto = src.nextInt(), valDepositos = src.nextInt(),
                valInvPermanentes = src.nextInt(), valDocsCobrarLargoPlazo = src.nextInt();

        ArrayList<Cuenta> activoFijo = new ArrayList<>();
        activoFijo.add(new Cuenta(9, "Terrenos"));
        activoFijo.add(new Cuenta(10, "Edificios"));
        activoFijo.add(new Cuenta(11, "Mobiliario y equipo"));
        activoFijo.add(new Cuenta(12, "Equipo de computo"));
        activoFijo.add(new Cuenta(13, "Equipo de entrega y reparto"));
        activoFijo.add(new Cuenta(14, "Depositos en garantia"));
        activoFijo.add(new Cuenta(15, "Inversiones temporales"));
        activoFijo.add(new Cuenta(16, "Documentos por cobrar a largo plazo"));

        if(Integer.toString(valTerrenos).equals(" ")) {activoFijo.remove(0);}
        if(Integer.toString(valEdificios).equals(" ")) {activoFijo.remove(1);}
        if(Integer.toString(valMobiliario).equals(" ")) {activoFijo.remove(2);}
        if(Integer.toString(valComputo).equals(" ")) {activoFijo.remove(3);}
        if(Integer.toString(valReparto).equals(" ")) {activoFijo.remove(4);}
        if(Integer.toString(valDepositos).equals(" ")) {activoFijo.remove(5);}
        if(Integer.toString(valInvPermanentes).equals(" ")) {activoFijo.remove(6);}
        if(Integer.toString(valDocsCobrarLargoPlazo).equals(" ")) {activoFijo.remove(7);}

        totalActivosFijo = valTerrenos + valEdificios + valMobiliario + valComputo + valReparto + valDepositos
                + valInvPermanentes + valDocsCobrarLargoPlazo;
    }

    void cuentaActivoDiferido() {
        int gastosInvestigacion = src.nextInt(),
                gastosPreoperativos = src.nextInt(),
                gastosMercadotecnia = src.nextInt(),
                gastosOrganizacion = src.nextInt(),
                gastosInstalacion = src.nextInt(),
                papeleriaUtiles = src.nextInt(),
                propaganda = src.nextInt(),
                primasSeguros = src.nextInt(),
                rentasPagadasAnticipado = src.nextInt(),
                inpuestosPagadosAnticipado = src.nextInt();

        ArrayList<Cuenta> activoDiferido = new ArrayList<>();
    }

}
