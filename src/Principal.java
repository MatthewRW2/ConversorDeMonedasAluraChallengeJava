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
                                System.out.println("Introduzca la cantidad en dólares a convertir:");
                                double cantidadDolaresToARS = scanner.nextDouble();
                                ConversorMoneda conversorDolarToARS = new ConversorMoneda(respuesta);
                                double resultadoDolarToARS = conversorDolarToARS.convertir(cantidadDolaresToARS, "USD", "ARS");
                                System.out.println(cantidadDolaresToARS + " dólares equivalen a " + resultadoDolarToARS + " pesos argentinos.");
                                break;
                            case 2:
                                // Realizar conversión de Peso argentino a Dólar
                                System.out.println("Introduzca la cantidad en pesos argentinos a convertir:");
                                double cantidadARSToDolares = scanner.nextDouble();
                                ConversorMoneda conversorARSToDolar = new ConversorMoneda(respuesta);
                                double resultadoARSToDolar = conversorARSToDolar.convertir(cantidadARSToDolares, "ARS", "USD");
                                System.out.println(cantidadARSToDolares + " pesos argentinos equivalen a " + resultadoARSToDolar + " dólares.");
                                break;
                            case 3:
                                // Realizar conversión de Dólar a Real brasileño
                                System.out.println("Introduzca la cantidad en dólares a convertir:");
                                double cantidadDolaresToBRL = scanner.nextDouble();
                                ConversorMoneda conversorDolarToBRL = new ConversorMoneda(respuesta);
                                double resultadoDolarToBRL = conversorDolarToBRL.convertir(cantidadDolaresToBRL, "USD", "BRL");
                                System.out.println(cantidadDolaresToBRL + " dólares equivalen a " + resultadoDolarToBRL + " reales brasileños.");
                                break;
                            case 4:
                                // Realizar conversión de Real brasileño a Dólar
                                System.out.println("Introduzca la cantidad en reales brasileños a convertir:");
                                double cantidadBRLToDolares = scanner.nextDouble();
                                ConversorMoneda conversorBRLToDolar = new ConversorMoneda(respuesta);
                                double resultadoBRLToDolar = conversorBRLToDolar.convertir(cantidadBRLToDolares, "BRL", "USD");
                                System.out.println(cantidadBRLToDolares + " reales brasileños equivalen a " + resultadoBRLToDolar + " dólares.");
                                break;
                            case 5:
                                // Realizar conversión de Dólar a Peso colombiano
                                System.out.println("Introduzca la cantidad en dólares a convertir:");
                                double cantidadDolaresToCOP = scanner.nextDouble();
                                ConversorMoneda conversorDolarToCOP = new ConversorMoneda(respuesta);
                                double resultadoDolarToCOP = conversorDolarToCOP.convertir(cantidadDolaresToCOP, "USD", "COP");
                                System.out.println(cantidadDolaresToCOP + " dólares equivalen a " + resultadoDolarToCOP + " pesos colombianos.");
                                break;
                            case 6:
                                // Realizar conversión de Peso colombiano a Dólar
                                System.out.println("Introduzca la cantidad en pesos colombianos a convertir:");
                                double cantidadCOPToDolares = scanner.nextDouble();
                                ConversorMoneda conversorCOPToDolar = new ConversorMoneda(respuesta);
                                double resultadoCOPToDolar = conversorCOPToDolar.convertir(cantidadCOPToDolares, "COP", "USD");
                                System.out.println(cantidadCOPToDolares + " pesos colombianos equivalen a " + resultadoCOPToDolar + " dólares.");
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