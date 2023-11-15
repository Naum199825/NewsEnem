/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.fml.newsenem;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    
    private LocalTime dataini;
    
    private LocalTime datafim;
    
    private boolean ativo;

    public ProcessoSeletivo() {
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

    public LocalTime getDataini() {
        return dataini;
    }

    public void setDataini(LocalTime dataini) {
        this.dataini = dataini;
    }

    public LocalTime getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalTime datafim) {
        this.datafim = datafim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
//</editor-fold>
    

    
    
}
