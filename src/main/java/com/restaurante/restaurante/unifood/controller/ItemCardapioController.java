package com.restaurante.restaurante.unifood.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.restaurante.Service.ItemCardapioService;
import com.restaurante.restaurante.model.ItemCardapio;

@RestController
@RequestMapping("/itesCardapio")
public class ItemCardapioController {

    @Autowired
    private ItemCardapioService service;

    @PostMapping
    public ItemCardapio criar(@RequestBody ItemCardapio item) {
        return service.criar(item);
    }

    @GetMapping
    public List<ItemCardapio> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/restaurante/{idRestaurante}")
    public List<ItemCardapio> listarPorRestaurante(@PathVariable String idRestaurante) {
        return service.listarPorRestaurante(idRestaurante);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }

}
