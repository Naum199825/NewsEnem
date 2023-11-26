/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package io.github.naum.newsenem.processoseletivo;

import javax.ejb.Local;

/**
 *
 * @author fried
 */
@Local
public interface ProcessoSeletivoServiceLocal {

    public void remove(ProcessoSeletivo ps);

    public void salvar(ProcessoSeletivo ps);

    public void update(ProcessoSeletivo ps);

    public void findbyID(Long id);
    
}
