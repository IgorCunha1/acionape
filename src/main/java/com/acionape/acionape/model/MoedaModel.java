package com.acionape.acionape.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "moeda", schema = "acionape")
public class MoedaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

}
