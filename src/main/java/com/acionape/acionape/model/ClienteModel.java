package com.acionape.acionape.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cliente", schema = "acionape")

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
