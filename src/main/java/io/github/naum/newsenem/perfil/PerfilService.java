/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.newsenem.perfil;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fried
 */
@Singleton
public class PerfilService implements PerfilServiceLocal {

    @PersistenceContext
    private EntityManager emPerfil;

    @Override
    public void salvar(Perfil perfil) {
        emPerfil.persist(perfil);
    }
    
    
}
