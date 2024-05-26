public class Principal {
    public static void main(String[] args) {
        ClienteTipoCambio clienteTipoCambio = new ClienteTipoCambio();

        clienteTipoCambio.obtenerUltimosTiposDeCambio()
                .thenAccept(respuesta -> {
                    System.out.println("Respuesta recibida: ");
                    System.out.println(respuesta);
                })
                .join();
    }
}
