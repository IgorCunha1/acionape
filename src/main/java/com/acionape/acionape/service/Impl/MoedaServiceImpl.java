package com.acionape.acionape.service.Impl;

import com.acionape.acionape.model.MoedaModel;
import com.acionape.acionape.repository.MoedaRepository;
import com.acionape.acionape.service.MoedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class MoedaServiceImpl implements MoedaService {

    @Autowired
    MoedaRepository moedaRepository;

    @Override
    public Optional<MoedaModel> findById(long id){ return moedaRepository.findById(id); }

    @Override
    public List<MoedaModel> list(){return moedaRepository.findAll();}

    @Override
    public MoedaModel store(MoedaModel model){return moedaRepository.save(model);}

}
