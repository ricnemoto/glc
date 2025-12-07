package br.com.glc.application.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.glc.application.DominioApplication;
import br.com.glc.application.dto.DominioDTO;
import br.com.glc.entity.Dominio;
import br.com.glc.services.DominioService;

@Component
public class DominioApplicationImpl implements DominioApplication {

    private final DominioService dominioService;

    @Autowired
    public DominioApplicationImpl(DominioService dominioService) {
        this.dominioService = dominioService;
    }

    @Override
    public List<DominioDTO> getDominios() {
        return this.dominioService.getDominios()
        .stream()
        .map(o -> new DominioDTO(o.getSigla(), o.getNome(), o.getDescricao(), o.getAtivo()))
        .collect(Collectors.toList());
    }

    @Override
    public void create(DominioDTO dominioDTO) {
        
        this.dominioService.saveAndCreate(new Dominio(dominioDTO.getSigla(), 
            dominioDTO.getNome(), dominioDTO.getDescricao(), 
            dominioDTO.getAtivo(), 
            LocalDateTime.now(), LocalDateTime.now()));
    }

    @Override
    public DominioDTO getDominio(String id) {
       Dominio d = this.dominioService.getDominioById(id); 
       return new DominioDTO(d.getSigla(), d.getNome(), d.getDescricao(), d.getAtivo());
    }
    
    
}
