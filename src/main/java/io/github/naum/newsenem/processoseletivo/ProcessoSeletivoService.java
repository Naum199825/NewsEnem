/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package io.github.naum.newsenem.processoseletivo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fried
 */
@Stateless
public class ProcessoSeletivoService implements ProcessoSeletivoServiceLocal {

    @PersistenceContext
    private EntityManager emPS;
    
    @Override
    public void salvar(ProcessoSeletivo ps) {
        emPS.persist(ps);
    }

    @Override
    public void remove(ProcessoSeletivo ps) {
        emPS.remove(ps);
    }

    @Override
    public void update(ProcessoSeletivo ps) {
        emPS.merge(ps);
    }

    @Override
    public void findbyID(Long id) {
        emPS.find(ProcessoSeletivo.class, id);
    }
    
    
}
