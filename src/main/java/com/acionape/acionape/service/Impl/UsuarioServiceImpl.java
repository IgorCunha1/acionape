package com.acionape.acionape.service.Impl;

import com.acionape.acionape.model.UsuarioModel;
import com.acionape.acionape.repository.UsuarioRepository;
import com.acionape.acionape.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UsuarioModel store(UsuarioModel model){
        return usuarioRepository.save(model);
    }

    @Override
    public List<UsuarioModel> list(){
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<UsuarioModel> findById(long id){
        return usuarioRepository.findById(id);
    }



}
