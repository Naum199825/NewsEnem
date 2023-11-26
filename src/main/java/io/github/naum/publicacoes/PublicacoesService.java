/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.publicacoes;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fried
 */
@Singleton
public class PublicacoesService implements PublicacoesServiceLocal {

    @PersistenceContext 
    private EntityManager emP;

    @Override
    public void salvar(Publicacao publicacao) {
        emP.persist(publicacao);
    }

    @Override
    public void remove(Publicacao publicacao) {
        emP.remove(publicacao);
    }

    @Override
    public void update(Publicacao publicacao) {
        emP.merge(publicacao);
    }

    @Override
    public void findbyID(Long id) {
        emP.find(Publicacao.class, id);
    }
    
    
    
    
    
    
    
    
    
    

    
    
}
