package com.restaurante.restaurante.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.restaurante.restaurante.model.Restaurante;

@Repository
public interface RestauranteRepository extends MongoRepository<Restaurante, String> {
    
}
