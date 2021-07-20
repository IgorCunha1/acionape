package com.acionape.acionape.repository;

import com.acionape.acionape.model.MoedaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoedaRepository extends JpaRepository<MoedaModel, Long> {

}
