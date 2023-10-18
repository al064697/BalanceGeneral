import java.util.Scanner;
import Cuentas.*;

public class BalanceGeneral {
    Scanner src = new Scanner(System.in);
    static Activo activo;
    static Pasivo pasivo;
    static CapitalContable capitalContable;

    public BalanceGeneral() {
        activo = new Activo();  // Crear una instancia de Activo
        pasivo = new Pasivo();  // Crear una instancia de Pasivo
        capitalContable = new CapitalContable(); //Crear una instancia de CapitalContable
    }

    // Método para leer la entrada del usuario
    String leerEntrada(String mensaje) {
        System.out.print(mensaje);
        return src.nextLine();
    }

    // Método para imprimir el encabezado
    void encabezado() {
        String nombreEntidad = leerEntrada("Nombre de la entidad: ");
        String fecha = leerEntrada("Fecha: ");
    }

    // Método para imprimir el pie de página
    void piePagina() {
        String autorizador = leerEntrada("Autorizado por: ");
        String elaborador = leerEntrada("Elaborado por: ");
    }

    public static void main(String[] args) {
        BalanceGeneral balanceGeneral = new BalanceGeneral();
        balanceGeneral.encabezado();  // Imprimir el encabezado
        capitalContable.total();
        System.out.println('\n' + '\n');
        balanceGeneral.piePagina();  // Imprimir el pie de página
    }
}
