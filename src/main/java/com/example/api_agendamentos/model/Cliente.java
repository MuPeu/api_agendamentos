package com.example.api_agendamentos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tb_clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String email;

    @Column
    private String telefone;

    @Column
    private LocalDateTime criado_em = LocalDateTime.now();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;

    public Cliente(){

    }

    public Cliente(Integer id, String nome, String email, String telefone, LocalDateTime criado_em, List<Agendamento> agendamentos){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.criado_em = criado_em;
        this.agendamentos = agendamentos;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public LocalDateTime getCriado_em() { return criado_em; }
    public void setCriado_em(LocalDateTime criado_em) { this.criado_em = criado_em; }

    public List<Agendamento> getAgendamentos() { return agendamentos; }
    public void setAgendamentos(List<Agendamento> agendamentos) { this.agendamentos = agendamentos; }
}