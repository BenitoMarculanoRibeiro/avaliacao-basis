package br.com.basis.prova.dominio;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROFESSOR")
public class Professor implements Serializable {

	private static final long serialVersionUID = 6062198644390047745L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "MATRICULA", nullable = false)
	private String matricula;

	@Column(name = "AREA", nullable = false)
	private String area;

	@Column(name = "DATA_NASCIMENTO", nullable = false)
	private LocalDate dataNascimento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}