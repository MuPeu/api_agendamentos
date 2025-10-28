package com.example.api_agendamentos.repository;

import com.example.api_agendamentos.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {

}
