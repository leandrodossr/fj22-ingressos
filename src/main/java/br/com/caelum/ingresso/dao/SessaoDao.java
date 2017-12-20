package br.com.caelum.ingresso.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class SessaoDao {

	private EntityManager manager;
	
	public void save(Sessao sessao){
		manager.persist(sessao);
	}
	
	public List<Sessao> buscaSessoesDaSala(Sala sala){
		return	manager.createQuery("select	s from Sessao s where s.sala =:sala",Sessao.class).setParameter("sala",sala).getResultList();
	}
}
