package br.com.basis.prova.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.exception.ProfessorNotFoundException;
import br.com.basis.prova.repository.ProfessorRepository;

@Service
public class BuscarProfessorPorIdServiceImpl {

	@Autowired
	private ProfessorRepository professorRepository;

	public Professor buscarPorId(Integer id) throws ProfessorNotFoundException {
		Optional<Professor> optionalProfessor = getOptional(id);
		Professor professor = null;
		if (!optionalProfessor.isPresent()) {
			throw new ProfessorNotFoundException("Professor nao encontrado atraves do ID: " + id);
		} else {
			professor = optionalProfessor.get();
		}
		return professor;
	}

	private Optional<Professor> getOptional(Integer id) {
		Optional<Professor> optionalProfessor = professorRepository.findById(id);
		return optionalProfessor;
	}

	public void deletarPorId(Integer id) throws ProfessorNotFoundException {
		Optional<Professor> optionalProfessor = getOptional(id);
		if (!optionalProfessor.isPresent()) {
			throw new ProfessorNotFoundException("Professor nao encontrado atraves do ID: " + id);
		} else {
			professorRepository.delete(optionalProfessor.get());
		}

	}

}
