package com.gestionPlus.inventoryService.Service;

import com.gestionPlus.inventoryService.Entity.Producto;

public interface ProductoService {

    Boolean compraRealizada(String nombreProducto, int cantidad);

    Long crearProducto(Producto producto);

    Boolean actualizarproducto(Producto producto);



}
