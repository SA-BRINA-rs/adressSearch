package br.com.alura.searcherAdress.data;

public class Adress {
    private String cep, logradouro, complemento, bairro, localidade, uf;

    public Adress(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return  "br.com.alura.searcherAdress.data.Adress: " +
                "cep: " + cep + '\'' +
                "logradouro: " + logradouro + '\'' +
                "complemento: " + complemento + '\'' +
                "bairro: " + bairro + '\'' +
                "localidade: " + localidade + '\'' +
                "uf: " + uf;
    }
}