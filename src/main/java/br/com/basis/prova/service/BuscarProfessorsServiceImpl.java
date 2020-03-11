package br.com.basis.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.repository.ProfessorRepository;

@Service
public class BuscarProfessorsServiceImpl {

	@Autowired
	private ProfessorRepository professorRepository;

	public List<Professor> buscarTodosOsProfessors() {
		List<Professor> listProfessor = professorRepository.findAll();
		return listProfessor;
	}
}
