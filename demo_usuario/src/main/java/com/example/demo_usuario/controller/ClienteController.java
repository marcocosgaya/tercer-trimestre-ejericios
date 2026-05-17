package com.example.demo_usuario.controller;

import com.example.demo_usuario.model.Cliente;
import com.example.demo_usuario.repository.ClienteDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteDAO clienteDAO;

    public ClienteController(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @GetMapping
    public List<Cliente> listar() {
        return clienteDAO.listarClientes();
    }

    @PostMapping
    public void insertar(@RequestBody Cliente c) {
        clienteDAO.insertarCliente(c);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable int id, @RequestBody Cliente c) {
        clienteDAO.actualizarCliente(id, c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        clienteDAO.eliminarCliente(id);
    }
}
