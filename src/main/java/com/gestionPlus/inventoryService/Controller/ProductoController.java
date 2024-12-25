package com.gestionPlus.inventoryService.Controller;

import com.gestionPlus.inventoryService.Entity.Producto;
import com.gestionPlus.inventoryService.Service.ProductoService;
import com.gestionPlus.inventoryService.Service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Producto")
public class ProductoController {

    @Autowired
    ProductoServiceImpl productoService;

    @PutMapping("/update/{nombreProducto}/{cantidad}")
    public Boolean productoComprado(@PathVariable("nombreProducto") String nombreProducto, @PathVariable("cantidad") int cantidad) {
        return productoService.compraRealizada(nombreProducto, cantidad);
    }

    @PostMapping
    public Long crearProducto(@RequestBody Producto producto){
        return productoService.crearProducto(producto);
    }

    @PutMapping()
    public Boolean actualizarProducto(@RequestBody Producto producto){
        return productoService.actualizarproducto(producto);
    }

    @GetMapping()
    public List<Producto> obtenerProductos(){
        return productoService.obtenerProductos();

    }
}

