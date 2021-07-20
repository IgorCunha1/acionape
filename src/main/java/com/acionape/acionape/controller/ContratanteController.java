package com.acionape.acionape.controller;


import com.acionape.acionape.model.ContratanteModel;
import com.acionape.acionape.repository.ContratanteRepository;
import com.acionape.acionape.service.Impl.ContratanteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContratanteController {

    @Autowired
    ContratanteRepository contratanteRepository;

    @Autowired
    ContratanteServiceImpl contratanteService;


    @RequestMapping(value = "/contratante")
    public List<ContratanteModel> list(){
        return contratanteRepository.findAll();
    }

    @GetMapping(path = "/contratante/{id}")
    public ResponseEntity findByID(@PathVariable long id){
        return contratanteRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(value = "/contratante")
    public ResponseEntity<ContratanteModel> store(@RequestBody ContratanteModel model){
        contratanteService.store(model);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);}

}
