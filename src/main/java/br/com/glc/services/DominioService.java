package br.com.glc.services;

import java.util.List;

import br.com.glc.entity.Dominio;

public interface DominioService {
    
    List<Dominio> getDominios();

    Dominio getDominioById(String siglaDominio);
    
    void saveAndCreate(Dominio dominio);

    Dominio updateInfo(Dominio dominio);

}
