/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio.Interfaces;

import Negocio.Agricultor;

/**
 *
 * @author fbc
 */
public interface RepositorioInterfaceAgricultor {

    public Agricultor recuperar(Long id);

    public void adicionar(Agricultor agricultor);

    public void atualizar(Agricultor agricultor);

    public void remover(Agricultor agricultor);
}
