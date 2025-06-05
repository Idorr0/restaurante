package com.restaurante.restaurante.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "itens_cardapio")
public class ItemCardapio {

    @Id
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private String restauranteId;
    
    public ItemCardapio() {}
    
    public ItemCardapio(String nome, String descricao, double preco, String restauranteId) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.restauranteId = restauranteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getRestauranteId() {
        return restauranteId;
    }

    public void setRestauranteId(String restauranteId) {
        this.restauranteId = restauranteId;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
