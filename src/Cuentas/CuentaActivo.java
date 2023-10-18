package Cuentas;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaActivo {
    Scanner src = new Scanner(System.in);
    private int totalActivoCirculantes, totalActivoFijo, totalActivoDiferidos;


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

        totalActivoCirculantes = valCaja + valBancos + valInversionesTemp + valMercan + valClientes + valDocsCobrar
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

        totalActivoFijo = valTerrenos + valEdificios + valMobiliario + valComputo + valReparto + valDepositos
                + valInvPermanentes + valDocsCobrarLargoPlazo;
    }

    void cuentaActivoDiferido() {
        int gastosInvestigacion = src.nextInt(), gastosPreoperativos = src.nextInt(),
                gastosMercadotecnia = src.nextInt(), gastosOrganizacion = src.nextInt(),
                gastosInstalacion = src.nextInt(), papeleriaUtiles = src.nextInt(), propaganda = src.nextInt(),
                primasSeguros = src.nextInt(), rentasPagadasAnticipado = src.nextInt(),
                interesesPagadosAnticipado = src.nextInt();

        ArrayList<Cuenta> activoDiferido = new ArrayList<>();
        activoDiferido.add(new Cuenta(17, "Gastos de investigacion y desarrollo"));
        activoDiferido.add(new Cuenta(18, "Gastos en etapas preoperativas de organizacion y administracion"));
        activoDiferido.add(new Cuenta(19, "Gastos de mercadotecnia"));
        activoDiferido.add(new Cuenta(20, "Gastos de organizacion"));
        activoDiferido.add(new Cuenta(21, "Gastos de instalacion"));
        activoDiferido.add(new Cuenta(22, "Papeleria y utiles"));
        activoDiferido.add(new Cuenta(23, "Propaganda y publicidad"));
        activoDiferido.add(new Cuenta(24, "Primas de seguros"));
        activoDiferido.add(new Cuenta(25, "Rentas pagadas por anticipado"));
        activoDiferido.add(new Cuenta(26, "Intereses pagados por anticipado"));

        if(Integer.toString(gastosInvestigacion).equals(" ")) {activoDiferido.remove(0);}
        if(Integer.toString(gastosPreoperativos).equals(" ")) {activoDiferido.remove(1);}
        if(Integer.toString(gastosMercadotecnia).equals(" ")) {activoDiferido.remove(2);}
        if(Integer.toString(gastosOrganizacion).equals(" ")) {activoDiferido.remove(3);}
        if(Integer.toString(gastosInstalacion).equals(" ")) {activoDiferido.remove(4);}
        if(Integer.toString(papeleriaUtiles).equals(" ")) {activoDiferido.remove(5);}
        if(Integer.toString(propaganda).equals(" ")) {activoDiferido.remove(6);}
        if(Integer.toString(primasSeguros).equals(" ")) {activoDiferido.remove(7);}
        if(Integer.toString(rentasPagadasAnticipado).equals(" ")) {activoDiferido.remove(8);}
        if(Integer.toString(interesesPagadosAnticipado).equals(" ")) {activoDiferido.remove(9);}

        totalActivoDiferidos = gastosInvestigacion + gastosPreoperativos + gastosMercadotecnia + gastosOrganizacion
                + gastosInstalacion + papeleriaUtiles + propaganda + primasSeguros + rentasPagadasAnticipado
                + interesesPagadosAnticipado;
    }

    public int totalActivos() {return totalActivoCirculantes + totalActivoFijo +totalActivoDiferidos;}
}
