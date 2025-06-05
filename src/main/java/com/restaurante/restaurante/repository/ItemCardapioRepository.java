package com.restaurante.restaurante.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.restaurante.restaurante.model.ItemCardapio;

@Repository
public interface ItemCardapioRepository extends MongoRepository<ItemCardapio, String> {
    List<ItemCardapio> findByRestauranteId(String restauranteId);
}
