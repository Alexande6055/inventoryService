package com.gestionPlus.inventoryService.Service;

import com.gestionPlus.inventoryService.Entity.Producto;
import com.gestionPlus.inventoryService.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    @Override
    public Boolean compraRealizada(String nombreProducto, int cantidad) {
        int filasAfectadas;
        filasAfectadas = productoRepository.insertProduCompra(nombreProducto,cantidad);
        return filasAfectadas>0;
    }

    @Override
    public Long crearProducto(Producto producto){
        Producto p=productoRepository.save(producto);
        return p.getIdProducto();
    }

    @Override
    public Boolean actualizarproducto(Producto producto) {
        Producto p=productoRepository.save(producto);
        return true;
    }

    public List<Producto> obtenerProductos() {
        return productoRepository.findAll();
    }
}
