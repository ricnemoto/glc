package br.com.glc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.glc.application.dto.TermoDTO;
import jakarta.validation.Valid;

@RequestMapping("/termo")
@RestController
public class TermoController {
    
    @GetMapping
    public String getTermos() {
        return "ok";
    }

    @PostMapping
    public void saveAndCreate(@Valid @RequestBody TermoDTO termoDTO){

    }

}
