/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.newsenem.processoseletivo;

import io.github.fml.newsenem.Resultados;
import io.github.naum.newsenem.perfil.Perfil;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fried
 */
@Entity
public class ProcessoSeletivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String edicao;
    
    private LocalDate dataini;
    
    private LocalDate datafim;
    
    private boolean ativo;
    
    @ManyToMany(mappedBy = "participa")
    private List<Perfil> participantes;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Resultados results;

    public ProcessoSeletivo() {
        participantes = new ArrayList<>();
    }
    
    
   //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public LocalDate getDataini() {
        return dataini;
    }

    public void setDataini(LocalDate dataini) {
        this.dataini = dataini;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
      public List<Perfil> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Perfil> participantes) {
        this.participantes = participantes;
    }

    public Resultados getResults() {
        return results;
    }

    public void setResults(Resultados results) {
        this.results = results;
    }
    
//</editor-fold>
    
}
