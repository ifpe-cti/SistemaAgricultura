/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio.Implementacoes;

import Negocio.Agricultor;
import Repositorio.Interfaces.RepositorioInterfaceAgricultor;

/**
 *
 * @author fbc
 */
public class RepositorioImplementacaoAgricultorBD implements RepositorioInterfaceAgricultor {

    @Override
    public Agricultor recuperar(Long id) {
        return (Agricultor) DaoHibernate.DaoManagerHiber.recoverPrimeiro("from agricultor where id = " + id);
    }

    @Override
    public void adicionar(Agricultor agricultor) {
        DaoHibernate.DaoManagerHiber.persist(agricultor);
    }

    @Override
    public void atualizar(Agricultor agricultor) {
        DaoHibernate.DaoManagerHiber.update(agricultor);
    }

    @Override
    public void remover(Agricultor agricultor) {
        DaoHibernate.DaoManagerHiber.delete(agricultor);
    }
}
