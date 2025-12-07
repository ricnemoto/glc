package br.com.glc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.glc.entity.Dominio;

@Repository
public interface DominioRepository extends JpaRepository <Dominio, String>{
    
}