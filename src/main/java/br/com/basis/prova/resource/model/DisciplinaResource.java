package br.com.basis.prova.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.basis.prova.dominio.Professor;

public class DisciplinaResource implements Serializable {

	private static final long serialVersionUID = 6030862910379069667L;

	@JsonProperty("NOME")
	private String nome;

	@JsonProperty("DESCRICAO")
	private String descricao;

	@JsonProperty("CARGA_HORARIA")
	private String cargaHoraria;

	@JsonProperty("ATIVA")
	private String ativa;

	@JsonProperty("PROFESSOR")
	private Professor professor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getAtiva() {
		return ativa;
	}

	public void setAtiva(String ativa) {
		this.ativa = ativa;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProfessorResource [nome=" + nome + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria
				+ ", ativa=" + ativa + ", professor=" + professor.getNome() + "]";
	}
}