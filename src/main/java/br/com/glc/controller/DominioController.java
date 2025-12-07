package br.com.glc.controller;

import jakarta.validation.Valid;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import br.com.glc.application.DominioApplication;
import br.com.glc.application.dto.DominioDTO;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin
@RequestMapping("/dominio")
@RestController
public class DominioController {
    
    private final DominioApplication dominioApplication;

    @Autowired
    public DominioController(DominioApplication dominioApplication) {
        this.dominioApplication = dominioApplication;
    }

    @GetMapping
    public ResponseEntity<List<DominioDTO>> getDominios() {

        return ResponseEntity.ok(dominioApplication.getDominios());
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<DominioDTO> getMethodName(@PathVariable("id") String id) {

        return ResponseEntity.ok(dominioApplication.getDominio(id));
    }
    
    @PostMapping
    public ResponseEntity<String> create(@Valid @RequestBody DominioDTO dominioDTO) {
        dominioApplication.create(dominioDTO);
        return ResponseEntity.status(201).build();
    }
    
}
