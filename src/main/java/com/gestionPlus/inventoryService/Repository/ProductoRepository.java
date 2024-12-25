package com.gestionPlus.inventoryService.Repository;

import com.gestionPlus.inventoryService.Entity.Producto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Modifying //Especifica que la consulta no es un select sino mas bien un update
    @Transactional  //segurarnos que se ejecute dentro de una transaccion
    @Query("UPDATE Producto p SET p.stock=p.stock-:cantidad WHERE p.nombre=:nombreProducto ")
    int insertProduCompra(@Param("nombreProducto") String nombreProducto,@Param("cantidad") int cantidad);

}
