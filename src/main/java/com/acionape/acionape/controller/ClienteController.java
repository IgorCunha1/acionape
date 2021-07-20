package com.acionape.acionape.controller;

import com.acionape.acionape.model.ClienteModel;
import com.acionape.acionape.repository.ClienteRepository;
import com.acionape.acionape.service.Impl.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteServiceImpl clienteService;

    @RequestMapping(value = "/cliente")
    public List<ClienteModel> list(){
        return clienteRepository.findAll();
    }

    @GetMapping (path = "/cliente/{id}")
    public ResponseEntity findById(@PathVariable long id){
        return clienteRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping (value = "/cliente")
    public ResponseEntity<ClienteModel> store(@RequestBody ClienteModel model){
        clienteService.store(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }



}
