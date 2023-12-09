package br.com.alura.searcherAdress.data;

import java.time.LocalDate;

public class Register extends Adress{


    private String name, phoneNumber;
    private LocalDate dataDeNascimento;

    public Register(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
        super(cep, logradouro, complemento, bairro, localidade, uf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Register: " +
                "name: " + name + '\'' +
                "phoneNumber: " + phoneNumber + '\'' +
                "dataDeNascimento: " + dataDeNascimento;
    }
}
