package br.com.basis.prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.basis.prova.dominio.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
