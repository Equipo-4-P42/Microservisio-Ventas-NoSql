package com.misionburger.ventas_ms.repositories;

import com.misionburger.ventas_ms.models.Plato;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlatoRepository extends MongoRepository<Plato, String>{
}
