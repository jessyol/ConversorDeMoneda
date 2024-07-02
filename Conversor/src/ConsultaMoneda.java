import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaMoneda {

    public Monedas buscarMoneda(String monedaBase,String monedaTarget) throws RuntimeException {
final String key = "c127a3bfad09a6c943ef6ae1";
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/"+key+"/pair/"+monedaBase+"/"+monedaTarget);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Monedas.class);
        }

        catch (Exception e){

            throw new RuntimeException("No encontre la moneda");
        }
    }


}
