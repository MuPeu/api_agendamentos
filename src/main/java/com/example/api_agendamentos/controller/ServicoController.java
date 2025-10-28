package com.example.api_agendamentos.controller;

import com.example.api_agendamentos.model.Servico;
import com.example.api_agendamentos.service.ServicoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mecanica/servicos")
public class ServicoController {

    private final ServicoService servicoService;

    public ServicoController(ServicoService servicoService){
        this.servicoService = servicoService;
    }

    @GetMapping
    public List<Servico> listar() { return servicoService.listarTodos(); }

    @PostMapping
    public ResponseEntity<Servico> salvar(@RequestBody Servico servico) {
        Servico novo = servicoService.salvar(servico);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }
}
