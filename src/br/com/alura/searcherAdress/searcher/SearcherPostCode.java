package br.com.alura.searcherAdress.searcher;

import br.com.alura.searcherAdress.data.Adress;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class SearcherPostCode {

    String busca=" ";
    public Adress buscaEndereco(String cep) throws IOException, InterruptedException {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();
            // Aqui você pode fazer o parse do JSON retornado pela resposta e criar o objeto Adress
            return new Gson().fromJson(response.body(), Adress.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possível encontrar um endereço por este número de cep");
        }



    }


}
