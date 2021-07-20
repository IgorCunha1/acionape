package com.acionape.acionape.controller;

import com.acionape.acionape.model.UsuarioModel;
import com.acionape.acionape.repository.UsuarioRepository;
import com.acionape.acionape.service.Impl.UsuarioServiceImpl;
import com.acionape.acionape.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @RequestMapping(value = "/usuario")
    public List<UsuarioModel> list(){
        return usuarioRepository.findAll();
    }

    @GetMapping(path = {"/usuario/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return usuarioRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/usuario" )
    public ResponseEntity<UsuarioModel> store(@RequestBody UsuarioModel model){
        usuarioService.store(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }






}
