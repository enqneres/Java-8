package esolutions.br;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class Inferencia {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://deviniciative.wordpress.com/2019/09/12/entendendo-o-sistema-de-modulos-do-java-parte-1/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public void testar (){

    }
}
