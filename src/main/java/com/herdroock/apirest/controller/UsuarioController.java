package com.herdroock.apirest.controller;

import com.herdroock.apirest.model.Usuario;
import com.herdroock.apirest.repository.UsuarioRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return repository.save(usuario);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        
    }

}
