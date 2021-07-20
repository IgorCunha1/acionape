package com.acionape.acionape.service.Impl;

import com.acionape.acionape.model.ContratanteModel;
import com.acionape.acionape.repository.ContratanteRepository;
import com.acionape.acionape.service.ContratanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratanteServiceImpl implements ContratanteService {


    @Autowired
    ContratanteRepository contratanteRepository;


    @Override
    public ContratanteModel store(ContratanteModel model) {return contratanteRepository.save(model);}

    @Override
    public List<ContratanteModel> list(){return contratanteRepository.findAll();}

    @Override
    public Optional<ContratanteModel> findById(long id){return contratanteRepository.findById(id);}

}
