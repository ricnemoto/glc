package br.com.glc.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.glc.entity.Dominio;
import br.com.glc.repository.DominioRepository;
import br.com.glc.services.DominioService;
import jakarta.validation.constraints.NotNull;

@Service
public class DominioServiceImpl implements DominioService {

    private final DominioRepository dominioRepository;

    @Autowired
    public DominioServiceImpl(DominioRepository dominioRepository) {
        this.dominioRepository = dominioRepository;
    }

    @Override
    public List<Dominio> getDominios() {
        return this.dominioRepository.findAll();
    }


    @Override
    public void saveAndCreate(Dominio dominio) {
       this.dominioRepository.save(dominio);
    }

    @Override
    public Dominio updateInfo(Dominio dominio) {
        this.dominioRepository.save(dominio);
        
        Optional<Dominio> dom = Optional.of(this.dominioRepository.findById(dominio.getSigla()).get());
        if(dom.isPresent()) {
            return dom.get();
        }else {
            return null;
        }
    }

    @Override
    public Dominio getDominioById(String siglaDominio) {
        return this.dominioRepository.findById(siglaDominio).get();
    }
    
    
}
