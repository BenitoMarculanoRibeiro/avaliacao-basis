package br.com.basis.prova.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DISCIPLINA")
@NoArgsConstructor
@Getter
@Setter
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 6711539059382625855L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private Integer id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "DESCRICAO", nullable = false)
	private String descricao;

	@Column(name = "CARGA_HORARIA", nullable = false)
	private Integer cargaHoraria;

	@Column(name = "ATIVA", nullable = false)
	private Integer ativa;

	@ManyToOne
	@JoinColumn(name = "PROFESSOR", nullable = false)
	private Professor professor;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getAtiva() {
		return ativa;
	}

	public void setAtiva(Integer ativa) {
		this.ativa = ativa;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
