package com.acionape.acionape.model;


import com.acionape.acionape.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="usuario", schema = "acionape")

public class UsuarioModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String senha;




    public String getName() {
        return this.name;
    }

    public String getSenha() {
        return senha;
    }
}
