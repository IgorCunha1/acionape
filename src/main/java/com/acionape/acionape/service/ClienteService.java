package com.acionape.acionape.service;

import com.acionape.acionape.model.ClienteModel;
import com.acionape.acionape.model.UsuarioModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface ClienteService {


    public ClienteModel store(ClienteModel clienteModel);

    public List<ClienteModel> list();

    public Optional<ClienteModel> findById(long id);


}
