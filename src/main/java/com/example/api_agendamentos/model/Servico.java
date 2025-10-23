package com.example.api_agendamentos.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_servicos")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String descr;

    @Column
    private Double preco;

    @Column
    private LocalDateTime criado_em = LocalDateTime.now();

    public Servico(){

    }

    public Servico(Integer id, String nome, String descr, Double preco, LocalDateTime criado_em) {
        this.id = id;
        this.nome = nome;
        this.descr = descr;
        this.preco = preco;
        this.criado_em = criado_em;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescr() { return descr; }
    public void setDescr(String descr) { this.descr = descr; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public LocalDateTime getCriado_em() { return criado_em; }
    public void setCriado_em(LocalDateTime criado_em) { this.criado_em = criado_em; }
}
