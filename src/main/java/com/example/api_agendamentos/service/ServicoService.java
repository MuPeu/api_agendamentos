package com.example.api_agendamentos.service;

import com.example.api_agendamentos.model.Servico;
import com.example.api_agendamentos.repository.ServicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {
    private final ServicoRepository servicoRepository;

    public ServicoService(ServicoRepository servicoRepository){
        this.servicoRepository = servicoRepository;
    }

    public List<Servico> listarTodos() { return servicoRepository.findAll(); }

    public Servico salvar(Servico servico) { return servicoRepository.save(servico); }

    public Optional<Servico> buscarPorId(Integer id) { return servicoRepository.findById(id); }

    public void deletar(Integer id) { servicoRepository.deleteById(id); }
}
