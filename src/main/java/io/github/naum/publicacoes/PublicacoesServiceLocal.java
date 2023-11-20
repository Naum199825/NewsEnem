/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.publicacoes;

import javax.ejb.Local;

/**
 *
 * @author fried
 */
@Local
public interface PublicacoesServiceLocal {

    void salvar(Publicacao publicacao);
    
}
