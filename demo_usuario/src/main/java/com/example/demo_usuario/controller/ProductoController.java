package com.example.demo_usuario.controller;

import com.example.demo_usuario.model.Producto;
import com.example.demo_usuario.repository.ProductoDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoDAO ProductoDAO;

    public ProductoController(ProductoDAO ProductoDAO) {
        this.ProductoDAO = ProductoDAO;
    }

    @GetMapping
    public List<Producto> listar() {
        return ProductoDAO.listarProductos();
    }

    @PostMapping
    public void insertar(@RequestBody Producto p) {
        ProductoDAO.insertarProducto(p);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable int id, @RequestBody Producto p) {
        ProductoDAO.actualizarProducto(id, p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        ProductoDAO.eliminarProducto(id);
    }
}
