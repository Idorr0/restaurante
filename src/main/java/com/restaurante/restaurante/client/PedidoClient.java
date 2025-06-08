package com.restaurante.restaurante.client;

import com.restaurante.restaurante.dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class PedidoClient {

    private static final String BASE_URL = "https://pedidoplus-production.up.railway.app"; // Altere para o endereço real
    private static final Logger logger = LoggerFactory.getLogger(PedidoClient.class);

    @Autowired
    private RestTemplate restTemplate;

    public List<PedidoDTO> listarPedidos() {
        try {
            PedidoDTO[] pedidos = restTemplate.getForObject(BASE_URL + "api/pedidos", PedidoDTO[].class);
            if (pedidos != null) {
                return Arrays.asList(pedidos);
            } else {
                logger.warn("Nenhum pedido retornado pelo serviço de pedidos.");
                return Collections.emptyList();
            }
        } catch (Exception e) {
            logger.error("Erro ao buscar pedidos: {}", e.getMessage());
            return Collections.emptyList();
        }
    }
}
