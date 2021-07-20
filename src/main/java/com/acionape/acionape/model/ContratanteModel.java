package com.acionape.acionape.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contratante", schema = "acionape")

public class ContratanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cnpj;


}
