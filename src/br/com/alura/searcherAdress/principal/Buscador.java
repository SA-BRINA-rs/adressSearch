package br.com.alura.searcherAdress.principal;

import br.com.alura.searcherAdress.data.Adress;
import br.com.alura.searcherAdress.searcher.GeradorDeArquivo;
import br.com.alura.searcherAdress.searcher.SearcherPostCode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Buscador {
    public static void main(String[] args) {

        String busca = " ";
        SearcherPostCode searcherPostCode = new SearcherPostCode();
        while(!busca.equalsIgnoreCase("sair")) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("Digite o cep para buscar o seu endereço: ");
            busca = myScan.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            try {
                Adress newAdress = searcherPostCode.buscaEndereco(busca);
                System.out.println(newAdress);
                GeradorDeArquivo gerador = new GeradorDeArquivo();
                gerador.salvarJson(newAdress);
            } catch (IOException | InterruptedException e) {
                System.out.println(e.getMessage());
                System.out.println("Aplicação finalizado");

            }
        }

    }

}
