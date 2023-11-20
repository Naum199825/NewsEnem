/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.newsenem.perfil;

import javax.ejb.Local;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fried
 */
@Local
public interface PerfilServiceLocal {
    
    @PersistenceContext

    void salvar(Perfil perfil);
    
    
}
