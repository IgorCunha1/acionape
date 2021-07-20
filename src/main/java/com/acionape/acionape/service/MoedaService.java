package com.acionape.acionape.service;


import com.acionape.acionape.model.MoedaModel;


import java.util.List;
import java.util.Optional;


public interface MoedaService {

    public List<MoedaModel> list();

    public MoedaModel store(MoedaModel model);

    public Optional<MoedaModel> findById(long id);
}
