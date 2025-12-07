package br.com.glc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.glc.entity.Termo;
import br.com.glc.entity.TermoId;

@Repository
public interface TermoRepository extends JpaRepository<Termo, TermoId> {
    
}
