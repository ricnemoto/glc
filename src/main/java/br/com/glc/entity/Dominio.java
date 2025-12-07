package br.com.glc.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "\"dominio\"", schema = "\"glossario\"")
public class Dominio {
    
    @Id
    @Column(name = "sg_dom", length = 3) 
    @NotNull
    private String sigla;
    @Column(name = "nm_dom", length = 100)
    @NotNull
    private String nome;
    @Column(name = "desc_dom")
    private String descricao;
    @Column(name = "atv_dom")
    @NotNull
    private Boolean ativo;
    @Column(name = "dt_hr_cria")
    @NotNull
    private LocalDateTime dataHoraCriacao;
    @Column(name = "dt_hr_ult_atu")
    private LocalDateTime dataHoraultimaAtualizacao;


}
