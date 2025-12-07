package br.com.glc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "termo")
public class Termo {

    @EmbeddedId
    private TermoId termoId;
    private String nome;
    private String conceito;
    @Column(name = "dt_hr_criacao")
    private LocalDateTime dataHoraCriacao;
    @Column(name = "dt_hr_ult_atu")
    private LocalDateTime dataHoraUltimaAtualizacao;

}
