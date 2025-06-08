package com.restaurante.restaurante.dto;

public class PedidoDTO {

    private String clienteId;
    private Double valorTotal;
    
    public String getClienteId() {
        return clienteId;
    }
    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
