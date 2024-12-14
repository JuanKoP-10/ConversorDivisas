import java.util.Scanner;

public class ConvercionDivisa {
    public static void convertir(String divisaBase,
                                 String divisaTarget,
                                 ConsultaDivisa consulta,
                                 Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Divisa divisa = consulta.buscarDivisa(divisaBase, divisaTarget);
        System.out.println("La tasa conversion actual de la divisa es de \n"
                + divisaBase + " = " + divisa.conversion_rate() + " " + divisaTarget);
        System.out.println("Ingrese la cantidad de " + divisaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * divisa.conversion_rate();
        System.out.println(cantidad + " = " + cantidadConvertida + " " + divisa.target_code());

    }

    public static void convertirOtraDivisa (ConsultaDivisa consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda Base:");
        String divisaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la divisa a la que desea cambiar");
        String divisaCambio = lectura.nextLine().toUpperCase();
        convertir(divisaBase, divisaCambio, consulta, lectura);
    }
}