package br.com.basis.prova.resource.model;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfessorResource implements Serializable {

	private static final long serialVersionUID = 6030862910379069667L;
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("NOME")
	private String nome;

	@JsonProperty("MATRICULA")
	private String matricula;

	@JsonProperty("AREA")
	private String area;

	@JsonProperty("DATA_NASCIMENTO")
	private String dataNascimento;

	@JsonProperty("ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@JsonProperty("matricula")
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@JsonProperty("area")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@JsonProperty("dataNascimento")
	public LocalDate getDataNascimento() {
		return LocalDate.parse(dataNascimento);
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@JsonProperty("serialVersionUID")
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProfessorResource [nome=" + nome + ", matricula=" + matricula + ", area=" + area + ", data_nascimento="
				+ dataNascimento + "]";
	}

}
