import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ClienteTipoCambio clienteTipoCambio = new ClienteTipoCambio();
        Scanner scanner = new Scanner(System.in);

        clienteTipoCambio.obtenerUltimosTiposDeCambio()
                .thenAccept(respuesta -> {
                    System.out.println("Respuesta recibida: ");
                    System.out.println(respuesta);

                    boolean salir = false;
                    while (!salir) {
                        System.out.println("""
                            -------------------------------------------------------------
                            
                            Sea bienvenido al conversor de monedas =)
                            
                            1) Dólar            =>> Peso argentino
                            2) Peso argentino   =>> Dólar
                            3) Dólar            =>> Real brasileño
                            4) Real brasileño   =>> Dólar
                            5) Dólar            =>> Peso colombiano
                            6) Peso colombiano  =>> Dólar
                            7) Salir
                            Elija una opción válida:
                            """);

                        int opcionEscogida = scanner.nextInt();

                        switch (opcionEscogida) {
                            case 1:
                                // Realizar conversión de Dólar a Peso argentino
                                System.out.println("Conversión de Dólar a Peso argentino.");
                                break;
                            case 2:
                                // Realizar conversión de Peso argentino a Dólar
                                System.out.println("Conversión de Peso argentino a Dólar.");
                                break;
                            case 3:
                                // Realizar conversión de Dólar a Real brasileño
                                System.out.println("Conversión de Dólar a Real brasileño.");
                                break;
                            case 4:
                                // Realizar conversión de Real brasileño a Dólar
                                System.out.println("Conversión de Real brasileño a Dólar.");
                                break;
                            case 5:
                                // Realizar conversión de Dólar a Peso colombiano
                                System.out.println("Conversión de Dólar a Peso colombiano.");
                                break;
                            case 6:
                                // Realizar conversión de Peso colombiano a Dólar
                                System.out.println("Conversión de Peso colombiano a Dólar.");
                                break;
                            case 7:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opción inválida. Por favor, elija una opción válida.");
                                break;
                        }
                    }
                    scanner.close();
                })
                .join();
    }
}
