package com.acionape.acionape.service.Impl;

import com.acionape.acionape.model.ClienteModel;
import com.acionape.acionape.repository.ClienteRepository;
import com.acionape.acionape.repository.UsuarioRepository;
import com.acionape.acionape.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public ClienteModel store(ClienteModel model){ return clienteRepository.save(model);}

    @Override
    public List<ClienteModel> list(){ return clienteRepository.findAll();}

    @Override
    public Optional<ClienteModel> findById(long id){return clienteRepository.findById(id);}






}
