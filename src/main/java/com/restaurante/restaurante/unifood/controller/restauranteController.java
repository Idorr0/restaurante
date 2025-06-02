package com.restaurante.restaurante.unifood.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.restaurante.restaurante.model.restaurante;


@RestController
@RequestMapping("/restaurante")
public class restauranteController {
    private ArrayList<restaurante> restaurante = new ArrayList<>();
    public restauranteController(){
        restaurante.add(new restaurante(1,"restaurante 1","0912811823019", "pizzaria", "rua 1"));
        restaurante.add(new restaurante(2,"restaurante 2","0912811823019", "pizzaria", "rua 2"));
        restaurante.add(new restaurante(3,"restaurante 3","0912811823019", "pizzaria", "rua 3"));
    }

}
