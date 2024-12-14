import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaDivisa {
    public Divisa buscarDivisa(String divisaBase, String divisaTarget) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/e4627566691e7e83718c58dd/pair/"+divisaBase+"/"+divisaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        } catch (Exception e) {
            throw new RuntimeException("No se encontro la divisa en la base de datos");
        }
    }
}