package com.misionburger.ventas_ms.controllers;

import com.misionburger.ventas_ms.models.Plato;
import com.misionburger.ventas_ms.repositories.PlatoRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PlatoController {

    private final PlatoRepository platoRepository;

    public PlatoController(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    @GetMapping("/get/platos")
    List<Plato> getPlatos(){
        return platoRepository.findAll();
    }

    @PostMapping("/post/platos")
    Plato newPlato(@RequestBody Plato newPlato){
        return platoRepository.save(newPlato);
    }

    @PutMapping("/update/platos/{id}")
    Plato replacePlato(@RequestBody Plato newPlato, @PathVariable String id){
        return platoRepository.findById(id)
                .map(plato -> {
                    plato.setName_plato(newPlato.getName_plato());
                    plato.setDesc_plato(newPlato.getDesc_plato());
                    plato.setPrice(newPlato.getPrice());
                    plato.setUrl_img(newPlato.getUrl_img());
                    return platoRepository.save(plato);
                })
                .orElseGet(() -> {
                    newPlato.setId(id);
                    return platoRepository.save(newPlato);
                });
    }

    @DeleteMapping("/delete/platos/{id}")
    void deletePlato(@PathVariable String id){
        platoRepository.deleteById(id);
    }
}
