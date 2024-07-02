import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase,String monedaTarget,ConsultaMoneda consulta,Scanner Lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase,monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaBase+" = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingresa la cantidad de "+monedaBase);
        cantidad = Double.parseDouble(Lectura.nextLine());
        cantidadConvertida = cantidad*monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase+" = "+cantidadConvertida+" "+monedas.target_code());
    }


    public static void convertirOtraMoneda(ConsultaMoneda consulta, Scanner Lectura) {

        System.out.println("Ingrese el codigo de la moneda base: ");
        String MonedaBase = Lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = Lectura.nextLine().toUpperCase();
        convertir(MonedaBase,monedaObjetivo,consulta,Lectura);

    }
}