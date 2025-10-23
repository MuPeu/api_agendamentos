package com.example.api_agendamentos.service;

import com.example.api_agendamentos.model.Cliente;
import com.example.api_agendamentos.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodos() { return clienteRepository.findAll(); }

    public Cliente salvar(Cliente cliente) { return clienteRepository.save(cliente); }

    public Optional<Cliente> buscarPorId(Integer id) { return clienteRepository.findById(id); }

    public void deletar(Integer id) { clienteRepository.deleteById(id); }
}
