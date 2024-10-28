package com.Tcc.back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tb_atleta")
public class Atleta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAtleta")
    private Long idAtleta;

    @Column(nullable = false)
    private String nomeAtleta;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private Date dataNascimento;

    @Column(nullable = false)
    private String apelido;

    @Column(nullable = false)
    private String telefone;

    private int avaliacao;

    private int pontosFutebol;

    private int pontosVolei;

    private int pontosBasquete;

    private int pontosFutevolei;

    private String imagem;

    @JsonIgnore
    @OneToMany(mappedBy = "atleta")
    private List<Partida> partidas;
}
