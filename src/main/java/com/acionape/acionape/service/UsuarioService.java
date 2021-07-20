package com.acionape.acionape.service;

import com.acionape.acionape.model.UsuarioModel;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    public UsuarioModel store(UsuarioModel model);

    public List<UsuarioModel> list();

    public Optional<UsuarioModel> findById(long id);



}
