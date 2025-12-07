package br.com.glc.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class TermoId {
    
    private String siglaDominio;
    private String nomeTermo;
}
