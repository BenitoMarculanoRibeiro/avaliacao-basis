package br.com.basis.prova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
	List<Disciplina> findByProfessor(Professor professor);
}
