package com.restaurante.restaurante.client;

import com.restaurante.restaurante.dto.AtribuirEntregaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EntregaClient {

    private static final String BASE_URL = "https://reasonable-happiness-production.up.railway.app/api/deliveries";

    @Autowired
    private RestTemplate restTemplate;

    public AtribuirEntregaResponse atribuirEntrega(String orderId) {
        String url = BASE_URL + "/assign/" + orderId;
        return restTemplate.postForObject(url, null, AtribuirEntregaResponse.class);
    }
}