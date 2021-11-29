package com.misionburger.ventas_ms.repositories;

import com.misionburger.ventas_ms.models.Venta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface VentaRepository extends MongoRepository<Venta, String>{
    List<Venta> findByPlatoList (String platoList);

    @Query("{'username': ?0}")
    List<Venta> findByUsername (String username);

}
