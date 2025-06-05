package com.restaurante.restaurante.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurante.restaurante.model.ItemCardapio;
import com.restaurante.restaurante.repository.ItemCardapioRepository;

@Service
public class ItemCardapioService {

    @Autowired
    private ItemCardapioRepository repository;

    public ItemCardapio criar(ItemCardapio item) {
        return repository.save(item);
    }

    public List<ItemCardapio> listarTodos() {
        return repository.findAll();
    }

    public List<ItemCardapio> listarPorRestaurante(String restauranteId) {
        return repository.findByRestauranteId(restauranteId);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }

}
