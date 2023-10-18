package Cuentas;

public class CapitalContable {
    Activo activo = new Activo(); static Pasivo pasivo = new Pasivo();
    public void total() {
        double total = activo.totalActivo() - pasivo.totalPasivo();
        System.out.println("Capital contable $" + total);
    }
}
