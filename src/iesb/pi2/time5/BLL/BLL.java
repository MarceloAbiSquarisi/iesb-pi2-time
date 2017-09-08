/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesb.pi2.time5.BLL;

/**
 *
 * @author marce
 */
public interface BLL<T> {

    void inserir(T entidade) throws NegocioException;

    void alterar(T entidade) throws NegocioException;

    void excluir(T entidade) throws NegocioException;

    T consultar(int id) throws NegocioException;

    void validar(T entidade) throws NegocioException;

}
