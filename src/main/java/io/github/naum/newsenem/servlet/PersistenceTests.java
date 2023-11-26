/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package io.github.naum.newsenem.servlet;

import io.github.naum.newsenem.processoseletivo.ProcessoSeletivo;
import io.github.fml.newsenem.Resultados;
import io.github.naum.newsenem.perfil.Perfil;
import io.github.naum.newsenem.perfil.PerfilServiceLocal;
import io.github.naum.newsenem.processoseletivo.ProcessoSeletivoServiceLocal;
import io.github.naum.publicacoes.Publicacao;
import io.github.naum.publicacoes.PublicacoesServiceLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author fried
 */
@Transactional
@WebServlet(name = "PersistenceTests", urlPatterns = {"/PersistenceTests"})
public class PersistenceTests extends HttpServlet {

    @Inject
    private PerfilServiceLocal psl;
    
    @Inject
    private PublicacoesServiceLocal pusl;
    
    @Inject
    private ProcessoSeletivoServiceLocal processoS;
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Perfil p1 = new Perfil();
            p1.setNome("Friedrich");
            p1.setEmail("fnelc.friedrich@ghtl.com");
            p1.setDatanasc(LocalDate.of(1998, 10, 25));
            p1.setSenha("1234");
            p1.setTipoUser(Perfil.Usuario.Administrador);
            p1.setDatacriada(LocalDateTime.now());
            
            
            Perfil p2 = new Perfil();
            p2.setNome("Lorena");
            p2.setEmail("lado.lorena@ghtl.com");
            p2.setDatanasc(LocalDate.of(1999, 12, 10));
            p2.setSenha("123478");
            p2.setTipoUser(Perfil.Usuario.Editor);
            p2.setDatacriada(LocalDateTime.now());
            
            Publicacao pub1 = new Publicacao();
            pub1.setEditada(true);
            pub1.setData(LocalDate.of(2023, 11, 29));
            pub1.setConteudo("Brics etc etc geopolitica.");
            pub1.setLink("uol.com.br/?bricas-geopolitica");
            pub1.setLinkTwitter("x.com/brics");
            pub1.setTipoSecao(Publicacao.Secao.Noticias);
            pub1.setTitulo("Brics: Um novo Bloco Economico");
            pub1.setAdm(p1);
            pub1.setAcsso("Publico");
            
            Publicacao pub2 = new Publicacao();
            pub2.setEditada(false);
            pub2.setData(LocalDate.of(2023, 11, 29));
            pub2.setConteudo("Gabarito do Seletivo da PM sai dia etc etc.");
            pub2.setLink("uol.com.br/?processo-seletivo-pm");
            pub2.setLinkTwitter("x.com/pm");
            pub2.setTipoSecao(Publicacao.Secao.Noticias);
            pub2.setTitulo("Concurso da PM");
            pub2.setAdm(p1);
            pub2.setAcsso("Privado");
            
            
            ProcessoSeletivo ps1 = new ProcessoSeletivo();
            ps1.setAtivo(true);
            ps1.setDataini(LocalDate.of(2023, 12, 13));
            ps1.setDatafim(LocalDate.of(2023, 12, 25));
            ps1.getParticipantes().add(p1);
            ps1.getParticipantes().add(p2);
            
            Resultados res1 = new Resultados();
            res1.setDataLancamento(LocalDate.of(2023, 12, 31));
            res1.setEdicao("25º");
            res1.setEdital("editalconcursopm25");
            res1.setGabarito("gabaritoeditalconcursopm25");
            
            
            ps1.setResults(res1);
            
            p1.getParticipa().add(ps1);
            p2.getParticipa().add(ps1);
            
            p1.getPublis().add(pub1);
            p2.getPublis().add(pub2);
            
            psl.salvar(p1);
            psl.salvar(p2);
            pusl.salvar(pub1);
            pusl.salvar(pub2);
            processoS.salvar(ps1);
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PersistenceTests</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PersistenceTests at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
