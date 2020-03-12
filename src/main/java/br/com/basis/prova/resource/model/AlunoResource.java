package br.com.basis.prova.resource.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.basis.prova.dominio.Disciplina;

public class AlunoResource implements Serializable {

	private static final long serialVersionUID = 6030862910379069667L;

	@JsonProperty("NOME")
	private String nome;

	@JsonProperty("MATRICULA")
	private String matricula;

	@JsonProperty("CPF")
	private String cpf;

	@JsonProperty("DATA_NASCIMENTO")
	private String dataNascimento;

	@JsonProperty("ALUNO_DISCIPLINA")
	private List<Disciplina> disciplinas;

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "ProfessorResource [nome=" + nome + ", matricula=" + matricula + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", disciplinas=" + disciplinas.toString() + "]";
	}
}