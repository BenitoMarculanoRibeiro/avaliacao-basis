package br.com.basis.prova.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.exception.DisciplinaNotFoundException;
import br.com.basis.prova.repository.DisciplinaRepository;

@Service
public class BuscarDisciplinaPorIdServiceImpl {

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	public Disciplina buscarPorId(Integer id) throws DisciplinaNotFoundException {
		Optional<Disciplina> optionalDisciplina = getOptional(id);
		Disciplina disciplina = null;
		if (!optionalDisciplina.isPresent()) {
			throw new DisciplinaNotFoundException("Disciplina nao encontrado atraves do ID: " + id);
		} else {
			disciplina = optionalDisciplina.get();
		}
		return disciplina;
	}

	private Optional<Disciplina> getOptional(Integer id) {
		Optional<Disciplina> optionalDisciplina = disciplinaRepository.findById(id);
		return optionalDisciplina;
	}

	public void deletarPorId(Integer id) throws DisciplinaNotFoundException {
		Optional<Disciplina> optionalDisciplina = getOptional(id);
		if (!optionalDisciplina.isPresent()) {
			throw new DisciplinaNotFoundException("Disciplina nao encontrado atraves do ID: " + id);
		} else {
			disciplinaRepository.delete(optionalDisciplina.get());
		}

	}

}
