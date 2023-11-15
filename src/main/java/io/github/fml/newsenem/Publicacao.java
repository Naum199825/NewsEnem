/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.fml.newsenem;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author fried
 */
@Entity
public class Publicacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDate data;
    
    private String titulo;
    
    private String conteudo;
    
    private String link;
    
    private String linkTwitter;
    
    private boolean editada;
    
    private Secao TipoSecao;
    
    
    public enum Secao{
        Noticias,
        Editais,
        OrientacaoGeral,
        GabaritosProvas
        
    }

    public Publicacao() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isEditada() {
        return editada;
    }

    public void setEditada(boolean editada) {
        this.editada = editada;
    }

    public Secao getTipoSecao() {
        return TipoSecao;
    }

    public void setTipoSecao(Secao TipoSecao) {
        this.TipoSecao = TipoSecao;
    }
    
     public String getLinkTwitter() {
        return linkTwitter;
    }

    public void setLinkTwitter(String linkTwitter) {
        this.linkTwitter = linkTwitter;
    }
    
    
    
//</editor-fold>

   
}
