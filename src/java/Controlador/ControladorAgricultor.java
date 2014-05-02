/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Negocio.Agricultor;
import Repositorio.Implementacoes.RepositorioImplementacaoAgricultorBD;
import Repositorio.Interfaces.RepositorioInterfaceAgricultor;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author fbc
 */
@ManagedBean(name = "controladorA")
@SessionScoped
public class ControladorAgricultor {

    private RepositorioInterfaceAgricultor agricultores = null;

    public ControladorAgricultor() {
        agricultores = new RepositorioImplementacaoAgricultorBD();
    }

    public String inserir(Agricultor agricultor) {
        agricultores.adicionar(agricultor);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Agricultor cadastro com sucesso!"));
        
        return "Login.xhtml";
    }
}
