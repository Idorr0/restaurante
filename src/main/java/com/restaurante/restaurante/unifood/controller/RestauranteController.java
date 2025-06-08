package com.restaurante.restaurante.unifood.controller;

import com.restaurante.restaurante.Service.RestauranteService;
import com.restaurante.restaurante.client.EntregaClient;
import com.restaurante.restaurante.client.PedidoClient;
import com.restaurante.restaurante.dto.AtribuirEntregaResponse;
import com.restaurante.restaurante.dto.PedidoDTO;
import com.restaurante.restaurante.model.Restaurante;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @Autowired
    private EntregaClient entregaClient;

    @Autowired
    private PedidoClient pedidoClient;

    @GetMapping
    public List<Restaurante> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Restaurante criar(@RequestBody Restaurante restaurante) {
        return service.criar(restaurante); 
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }

    @GetMapping("/pedidos") 
    public List<PedidoDTO> listarTodosPedidos() {
        return pedidoClient.listarPedidos();
    }

    
    @PostMapping("/atribuir-entrega/{orderId}")
    public ResponseEntity<AtribuirEntregaResponse> atribuirEntrega(@PathVariable String orderId) {
        AtribuirEntregaResponse resp = entregaClient.atribuirEntrega(orderId);
        return ResponseEntity.ok(resp);
    }
}
