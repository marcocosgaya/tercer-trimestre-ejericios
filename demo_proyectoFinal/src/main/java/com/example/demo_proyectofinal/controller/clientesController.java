package com.example.demo_proyectofinal.repository;



import com.example.demo_proyectofinal.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class clientesController {

    private final ClienteDAO ClienteDAO;

    public clientesController(ClienteDAO clienteDAO) {
        this.ClienteDAO = clienteDAO;
    }

    @GetMapping
    public List<Cliente> listarCliente() {
        return ClienteDAO.listarCliente();
    }

    @PostMapping
    public void insertarCliente(@RequestBody Cliente Cliente) {
        ClienteDAO.insertarCliente(Cliente);
    }
}
