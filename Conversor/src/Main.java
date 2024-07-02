import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner Lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int option = 0;
        while (option != 8){
            System.out.println("****************\n" +
                    "Bienvenidos al conversor de monedas\n\n" +
                    "Ingrese la conversion que desea utilizar \n\n" +
                    "1. Dollar a Peso Argentino \n" +
                    "2. Peso Argentino a Dollar \n" +
                    "3. Dollar a Real Brasilero \n" +
                    "4. Real Brasilero a Dollar \n" +
                    "5. Dollar a Peso Colombiano \n" +
                    "6. Peso Colombiano a Dollar \n" +
                    "7. Convertir Otra Moneda \n" +
                    "8. Salir");
            option = Lectura.nextInt();
            Lectura.nextLine();

            switch (option){
                case 1:
                    ConvertirMoneda.convertir("USD","ARS",consulta,Lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS","USD", consulta, Lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL",consulta,Lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD",consulta,Lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP",consulta,Lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD",consulta,Lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consulta,Lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion No Valida");
                    break;



            }
        }
    }}