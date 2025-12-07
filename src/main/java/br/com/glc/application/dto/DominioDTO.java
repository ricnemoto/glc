package br.com.glc.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DominioDTO {
    
    private String sigla;
    private String nome;
    private String descricao;
    private Boolean ativo;
}
