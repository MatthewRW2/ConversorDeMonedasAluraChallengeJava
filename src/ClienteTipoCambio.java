import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class ClienteTipoCambio {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/7c6f2387cfe12ccf7c4c2c12/latest/USD";
    private HttpClient cliente;

    public ClienteTipoCambio() {
        this.cliente = HttpClient.newHttpClient();
    }

    public CompletableFuture<String> obtenerUltimosTiposDeCambio() {
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        return cliente.sendAsync(solicitud, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);
    }
}