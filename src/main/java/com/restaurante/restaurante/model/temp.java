package com.restaurante.restaurante.model;

import java.util.ArrayList;

public class temp {
    
    private int id;
    private String nome;
    private String cnpj;
    private String categoria;   
    private String endereco;
    private ArrayList<ItemCardapio> itensCardapio = new ArrayList<>();

public temp(int id, String nome, String cnpj, String categoria, String endereco) {
    this.id = id;
    this.nome = nome;
    this.cnpj = cnpj;
    this.categoria = categoria;
    this.endereco = endereco;
}

  public int getId() {
    return id;
}


public void setId(int id) {
    this.id = id;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getCnpj() {
    return cnpj;
}


public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
}


public String getCategoria() {
    return categoria;
}


public void setCategoria(String categoria) {
    this.categoria = categoria;
}


public String getEndereco() {
    return endereco;
}


public void setEndereco(String endereco) {
    this.endereco = endereco;
}


}
