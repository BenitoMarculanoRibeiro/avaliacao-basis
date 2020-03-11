package br.com.basis.prova.resource.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfessorResource implements Serializable {

	private static final long serialVersionUID = 6030862910379069667L;

	@JsonProperty("NOME")
	private String nome;

	@JsonProperty("MATRICULA")
	private String matricula;

	@JsonProperty("AREA")
	private String area;

	@JsonProperty("DATA_NASCIMENTO")
	private String dataNascimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProfessorResource [nome=" + nome + ", matricula=" + matricula + ", area=" + area + ", data_nascimento="
				+ dataNascimento + "]";
	}

}
