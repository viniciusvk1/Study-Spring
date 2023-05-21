package com.github.viniciusvk1.HibernateLessons.controller;

import com.github.viniciusvk1.HibernateLessons.Repository.UsuarioRepository;
import com.github.viniciusvk1.HibernateLessons.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Pagina inicial

    @GetMapping
    public String inicial() {
        return "Pagina inicial!";
    }

    // Faz a busca de todos os usuários já cadastrados no sistema
    @GetMapping("/cadastrados")
    public ResponseEntity<List<Usuario>> usuariosRegistrados() {
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    // Realiza a busca a partir de um ID de um usuário já cadastrado e retorna os dados do usuário
    @GetMapping("/cadastrados/{id}")
    public ResponseEntity<Usuario> buscarPorId(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .map(usuario -> ResponseEntity.ok(usuario))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Realiza a adicao de um novo usuário ao banco de dados
    @PostMapping("/cadastrar")
    public ResponseEntity<Usuario> addNovoUsuario(@Valid @RequestBody Usuario usuario) {
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
    }

    // Permite editar um usuario ja cadastrado buscando pelo id
    @PutMapping("/editar")
    public ResponseEntity<Usuario> editarUsuario(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.findById(usuario.getId())
                .map(resposta -> ResponseEntity.status(HttpStatus.OK).body(usuarioRepository.save(usuario)))
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Delete um usuario ja cadastrado no banco de dados fazendo a busca pelo id
    @DeleteMapping("/deletar/{id}")
    public void deletarUsuarioCadastrado(@PathVariable Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        usuarioRepository.deleteById(id);
    }


}
