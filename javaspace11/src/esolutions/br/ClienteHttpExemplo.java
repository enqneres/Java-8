package esolutions.br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteHttpExemplo {
    public static void main(String[] args) throws IOException, InterruptedException {
        conectAndPrintURL();
    }

    private static void conectAndPrintURL() throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#currentTimeMillis--"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println("STATUS CODE: " + response.statusCode());
        System.out.println("Headers responde: " + response.headers());
        System.out.println(response.body());
    }
}