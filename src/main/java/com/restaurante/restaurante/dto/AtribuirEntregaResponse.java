package com.restaurante.restaurante.dto;

public class AtribuirEntregaResponse {
    private String id;
    private String entregadorId;
    private String orderId;
    private String status;

    public AtribuirEntregaResponse() {}

    public AtribuirEntregaResponse(String id, String entregadorId, String orderId, String status) {
        this.id = id;
        this.entregadorId = entregadorId;
        this.orderId = orderId;
        this.status = status;
    }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEntregadorId() { return entregadorId; }
    public void setEntregadorId(String entregadorId) { this.entregadorId = entregadorId; }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}