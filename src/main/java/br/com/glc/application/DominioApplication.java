package br.com.glc.application;

import java.util.List;

import br.com.glc.application.dto.DominioDTO;

public interface DominioApplication {
 
    public List<DominioDTO> getDominios();

    public DominioDTO getDominio(String id);

    public void create(DominioDTO dominioDTO);
}
