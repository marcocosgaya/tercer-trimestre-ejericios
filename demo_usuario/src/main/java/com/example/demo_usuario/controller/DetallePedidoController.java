package com.example.demo_usuario.controller;

import com.example.demo_usuario.model.DetallePedido;
import com.example.demo_usuario.repository.DetallePedidoDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detalle")
public class DetallePedidoController {

    private final DetallePedidoDAO detalleDAO;

    public DetallePedidoController(DetallePedidoDAO detalleDAO) {
        this.detalleDAO = detalleDAO;
    }

    @GetMapping
    public List<DetallePedido> listar() {
        return detalleDAO.listarDetalle();
    }
}
