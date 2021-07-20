package com.acionape.acionape.service;

import com.acionape.acionape.model.ContratanteModel;

import java.util.List;
import java.util.Optional;

public interface ContratanteService {


    public ContratanteModel store(ContratanteModel contratanteModel);

    public List<ContratanteModel> list();

    public Optional<ContratanteModel> findById(long id);


}
