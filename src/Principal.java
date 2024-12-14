import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa consulta = new ConsultaDivisa();

        int selecion = 0;
        while (selecion != 8) {
            System.out.println("******************************** \n\n" +
                    "ingrese la conversion de divisa que desea realizar:\n" +
                    "1. Dolar a Peso Colombiano \n"+
                    "2 Peso Colombiano a Dolar \n"+
                    "3 Dolar a Real Brasilero \n"+
                    "4 Real Brasilero a Dolar \n"+
                    "5 Dolar a Peso Argentino \n"+
                    "6 Peso Argentino a Dolar \n"+
                    "7 Convertir otra divisa \n"+
                    "8 Salir del programa\n"+
                    "********************************");
            selecion = lectura.nextInt();
            lectura.nextLine();

            switch (selecion) {
                case 1:
                    ConvercionDivisa.convertir("USD", "COP", consulta, lectura);
                    break;
                case 2:
                    ConvercionDivisa.convertir("COP", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvercionDivisa.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 4:
                    ConvercionDivisa.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 5:
                    ConvercionDivisa.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 6:
                    ConvercionDivisa.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 7:
                    ConvercionDivisa.convertirOtraDivisa(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Finalizando ejecucucion del programa");
                    break;
            }

        }
    }
}
