package com.example.demo_usuario.controller;

import com.example.demo_usuario.model.Usuario;
import com.example.demo_usuario.repository.usuarioDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final usuarioDAO usuarioDAO;

    public UsuarioController(usuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioDAO.listarUsuarios();
    }

    @PostMapping
    public void insertarUsuario(@RequestBody Usuario usuario) {
        usuarioDAO.insertarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public void actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        usuarioDAO.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id) {
        usuarioDAO.eliminarUsuario(id);
    }
}
