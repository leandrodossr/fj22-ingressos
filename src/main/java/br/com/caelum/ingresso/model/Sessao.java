package br.com.caelum.ingresso.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Sessao {

	@Id
	@GeneratedValue
	private Integer Id;
	private LocalTime horario;
	
	@ManyToOne
	private Sala sala;
	
	@ManyToOne
	private Filme filme;
	
	public Sessao(){
		
	}
	
	public Sessao(LocalTime horario,Filme filme, Sala sala){
		this.horario = horario;
		this.filme   = filme;
		this.sala    = sala;
		
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	
}
