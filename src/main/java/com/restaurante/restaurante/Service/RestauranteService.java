package com.restaurante.restaurante.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurante.restaurante.model.Restaurante;
import com.restaurante.restaurante.repository.RestauranteRepository;

@Service
public class RestauranteService {
    
    @Autowired
    private RestauranteRepository repository;

    public List<Restaurante> listarTodos(){
        return repository.findAll();
    }
    
    public Restaurante criar(Restaurante restaurante) {
        return repository.save(restaurante);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}
