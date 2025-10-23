package com.example.api_agendamentos.controller;

import com.example.api_agendamentos.model.Cliente;
import com.example.api_agendamentos.service.ClienteService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listar() { return clienteService.listarTodos(); }

    @PostMapping
    public Cliente criar(@RequestBody Cliente cliente) { return clienteService.salvar(cliente); }
}
