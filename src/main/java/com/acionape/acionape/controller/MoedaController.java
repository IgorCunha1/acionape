package com.acionape.acionape.controller;


import com.acionape.acionape.model.MoedaModel;
import com.acionape.acionape.repository.MoedaRepository;
import com.acionape.acionape.service.Impl.MoedaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MoedaController {

    @Autowired
    MoedaRepository moedaRepository;

    @Autowired
    MoedaServiceImpl moedaService;

    @RequestMapping(value = "/moeda")
    public List<MoedaModel> list(){
        return moedaRepository.findAll();
    }

    @GetMapping(path = "/moeda/{id}")
    public ResponseEntity findById(@PathVariable long id){
        return moedaRepository.findById(id)
                .map(record -> ResponseEntity.ok(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/moeda")
    public ResponseEntity<MoedaModel> store(@RequestBody MoedaModel model){
        moedaService.store(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }
}
