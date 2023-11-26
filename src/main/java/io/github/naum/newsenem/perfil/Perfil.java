/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.naum.newsenem.perfil;

import io.github.naum.newsenem.processoseletivo.ProcessoSeletivo;
import io.github.naum.publicacoes.Publicacao;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author fried
 */
@Entity
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    
    private LocalDate datanasc;
    
    @Transient
    private Byte idade;
        
    private String email;
    
    private String senha;
    
    private LocalDateTime datacriada;
    
    @Enumerated(EnumType.ORDINAL)
    private Usuario TipoUser;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adm")
    private List<Publicacao> publis;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "participantes",
            joinColumns = @JoinColumn(name = "perfil_id"),
            inverseJoinColumns = @JoinColumn(name = "processoseletivo_id")
            )
    private List<ProcessoSeletivo> participa;
    
    public enum Usuario{
        Administrador,
        Editor,
        Candidato,
        Anonimo
    }

    public Perfil() {
        publis = new ArrayList<>();
        participa = new ArrayList<>();
        
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public Usuario getTipoUser() {
        return TipoUser;
    }

    public void setTipoUser(Usuario TipoUser) {
        this.TipoUser = TipoUser;
    }

    public LocalDateTime getDatacriada() {
        return datacriada;
    }

    public void setDatacriada(LocalDateTime datacriada) {
        this.datacriada = datacriada;
    }


    public List<Publicacao> getPublis() {
        return publis;
    }

    public void setPublis(List<Publicacao> publis) {
        this.publis = publis;
    }

    public List<ProcessoSeletivo> getParticipa() {
        return participa;
    }

    public void setParticipa(List<ProcessoSeletivo> participa) {
        this.participa = participa;
    }
    
    
    
    

//</editor-fold>
    
    public void CadastrarUser(){
        
    }
   
    public void login(){
        
    }
    
    public void recuperarConta(String email){
        
    }
    
   
    
}
