package br.com.basis.prova.dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {

	private static final long serialVersionUID = 4112678566536668131L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "MATRICULA", nullable = false)
	private String matricula;

	@Column(name = "CPF", nullable = false)
	@CPF
	private String cpf;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "DATA_NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;

	@ManyToMany
	@JoinTable(name = "ALUNO_DISCIPLINA", joinColumns = @JoinColumn(name = "ID_ALUNO", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_DISCIPLINA", referencedColumnName = "ID"))
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
