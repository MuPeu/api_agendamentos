package com.example.api_agendamentos.controller;

import com.example.api_agendamentos.model.Cliente;
import com.example.api_agendamentos.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/mecanica/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listar() { return clienteService.listarTodos(); }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
        Cliente novo = clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }
}
