package br.edu.infnet.apivotacao.model.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(
		name = "TEleicao",
		uniqueConstraints=
            @UniqueConstraint(columnNames={"descricao"})
		)
public class Eleicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime data;
	private String descricao;
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name="idEleicao")
	@JsonManagedReference(value="eleicao-votos")
	private List<Voto> votos;
	@OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name="idEleicao")
	@JsonManagedReference(value="eleicao-candidatos")
	private List<Candidato> candidatos;
	
	public Eleicao() {
		this.setData(LocalDateTime.now());
	}
	
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public List<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
