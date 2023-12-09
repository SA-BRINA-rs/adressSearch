package br.com.alura.searcherAdress.searcher;

import br.com.alura.searcherAdress.data.Adress;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvarJson(Adress adress) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter(adress.getCep() + ".json");
        escrita.write(gson.toJson(adress));
        escrita.close();

    }
}