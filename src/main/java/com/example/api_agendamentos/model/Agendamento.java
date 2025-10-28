package com.example.api_agendamentos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_servico")
    private Servico servico;

    @Column
    private LocalDateTime data_agendada;

    @Column
    private String observacoes;

    @Column
    private String status = "PENDENTE";

    @Column
    private LocalDateTime criado_em = LocalDateTime.now();

    public Agendamento(){

    }

    public Agendamento(Integer id, Cliente cliente, Servico servico, LocalDateTime data_agendada, String observacoes, String status, LocalDateTime criado_em){
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.data_agendada = data_agendada;
        this.observacoes = observacoes;
        this.status = status;
        this.criado_em = criado_em;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }

    public LocalDateTime getData_agendada() { return data_agendada; }
    public void setData_agendada(LocalDateTime data_agendada) { this.data_agendada = data_agendada; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCriado_em() { return criado_em; }
    public void setCriado_em(LocalDateTime criado_em) { this.criado_em = criado_em; }
}
