import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorMoneda {
    private JsonObject conversionRates;

    public ConversorMoneda(String jsonResponse) {
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(jsonResponse, JsonObject.class);
        conversionRates = jsonObject.getAsJsonObject("conversion_rates");
    }

    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        double tasaOrigen = conversionRates.get(monedaOrigen).getAsDouble();
        double tasaDestino = conversionRates.get(monedaDestino).getAsDouble();
        return cantidad * (tasaDestino / tasaOrigen);
    }
}