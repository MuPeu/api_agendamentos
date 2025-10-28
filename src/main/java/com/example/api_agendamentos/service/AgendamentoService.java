package com.example.api_agendamentos.service;

import com.example.api_agendamentos.model.Agendamento;
import com.example.api_agendamentos.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {
    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoService(AgendamentoRepository agendamentoRepository){
        this.agendamentoRepository = agendamentoRepository;
    }

    public List<Agendamento> listarTodos() { return agendamentoRepository.findAll(); }

    public Agendamento salvar(Agendamento agendamento) { return agendamentoRepository.save(agendamento); }

    public Optional<Agendamento> buscarAgendamento(Integer id) { return agendamentoRepository.findById(id); }

    public Agendamento atualizarAgendamento(Integer id, Agendamento agendamentoAtualizado) {
        Agendamento agendamentoExistente = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));

        agendamentoExistente.setData_agendada(agendamentoAtualizado.getData_agendada());
        agendamentoExistente.setStatus(agendamentoAtualizado.getStatus());

        return agendamentoRepository.save(agendamentoExistente);
    }

    public boolean deletar(Integer id) {
        if (agendamentoRepository.existsById(id)) {
            agendamentoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
