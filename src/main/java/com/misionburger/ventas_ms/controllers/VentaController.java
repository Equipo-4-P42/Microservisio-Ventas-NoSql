package com.misionburger.ventas_ms.controllers;

import com.misionburger.ventas_ms.models.Venta;
import com.misionburger.ventas_ms.models.Plato;
import com.misionburger.ventas_ms.repositories.PlatoRepository;
import com.misionburger.ventas_ms.repositories.VentaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class VentaController {

    private final PlatoRepository platoRepository;
    private final CustomerRepository customerRepository;
    private final VentaRepository ventaRepository;

    public VentaController(PlatoRepository platoRepository, CustomerRepository customerRepository, VentaRepository ventaRepository) {
        this.platoRepository = platoRepository;
        this.customerRepository = customerRepository;
        this.ventaRepository = ventaRepository;
    }

    @PostMapping("/post/ventas")
    Venta newVenta (@RequestBody Venta venta) {
        List<String> ids = new ArrayList<String>();
        Integer total_bill = 0;
        venta.getPlatoList().forEach((plato) -> ids.add(plato.getId()));
        List<Plato> platoList = (List<Plato>) platoRepository.findAllById(ids);
        for (int i = 0; i < venta.getPlatoList().size(); i++ ){
            if (venta.getPlatoList().get(i).getAmount() == null || venta.getPlatoList().get(i).getAmount() < 1){
                venta.getPlatoList().get(i).setAmount(1);
            }
            platoList.get(i).setAmount(venta.getPlatoList().get(i).getAmount());
            total_bill += platoList.get(i).getAmount()*platoList.get(i).getPrice();
        }
        venta.setTotal_bill(total_bill);
        venta.setPlatoList(platoList);
        venta.setTransaction_date(new Date());
        return ventaRepository.save(venta);
    }

    @GetMapping("/get/ventas/{username}")
    List<Venta> userVenta(@PathVariable String username){
        return ventaRepository.findByUsername(username);
    }


}
