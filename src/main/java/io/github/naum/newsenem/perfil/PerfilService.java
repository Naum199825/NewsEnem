/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package io.github.naum.newsenem.perfil;

import javax.ejb.Singleton;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 *
 * @author fried
 */
@Singleton
@Named
public class PerfilService implements PerfilServiceLocal {

    @PersistenceContext
    private EntityManager emPerfil;

    @Override
    public void salvar(Perfil perfil) {
        emPerfil.persist(perfil);
    }
    
    @Override
    public void remove(Perfil perfil) {
        emPerfil.remove(perfil);
    }

    @Override
    public void update(Perfil perfil) {
        emPerfil.merge(perfil);
    }

    @Override
    public void findbyID(Long id) {
        emPerfil.find(Perfil.class, id);
    }

    @Override
    public List<Perfil> BuscarPessoas() {
        Query q = emPerfil.createQuery("SELECT p FROM Perfil p");
        return (List<Perfil>) q.getResultList();
    }
}
