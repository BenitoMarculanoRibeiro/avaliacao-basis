package br.com.basis.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.basis.prova.dominio.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	// List<Aluno> findByDisciplina(Aluno aluno);
}
