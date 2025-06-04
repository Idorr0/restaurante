package com.restaurante.restaurante.unifood.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.restaurante.restaurante.model.temp;


@RestController
@RequestMapping("/restaurante")
public class restauranteController {
    private ArrayList<temp> restaurantes = new ArrayList<>();
    public restauranteController(){
        restaurantes.add(new temp(1,"restaurante 1","0912811823019", "pizzaria", "rua 1"));
        restaurantes.add(new temp(2,"restaurante 2","0912811823019", "pizzaria", "rua 2"));
        restaurantes.add(new temp(3,"restaurante 3","0912811823019", "pizzaria", "rua 3"));
    }

    @GetMapping
    public String listarRestaurantes() {
        String lista = "";
        for (int i = 0; i < restaurantes.size(); i++)
            lista = lista + "\n"+restaurantes.get(i).getNome()+" ("+restaurantes.get(i).getId()+")";
        return lista;
    }
    
    @PostMapping
    public void criarRestaurante(@RequestBody temp restaurante) {
        restaurantes.add(restaurante);
    }

    @DeleteMapping("/{id}")
    public void apagarRestaurante(@PathVariable int id){
        restaurantes.remove(id);
    }

}
