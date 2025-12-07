package br.com.glc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.glc.entity.Termo;
import br.com.glc.repository.TermoRepository;
import br.com.glc.services.TermoService;

@Service
public class TermoServiceImpl implements TermoService {

    private final TermoRepository termoRepository;

    @Autowired
    public TermoServiceImpl(TermoRepository termoRepository) {
        this.termoRepository = termoRepository;
    }

    @Override
    public List<Termo> getTermos() {
        return this.termoRepository.findAll();
    }

    
}
