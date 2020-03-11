package br.com.basis.prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.repository.DisciplinaRepository;

@Service
public class BuscarDisciplinasServiceImpl {

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	public List<Disciplina> buscarTodosOsDisciplinas() {
		List<Disciplina> listDisciplina = disciplinaRepository.findAll();
		return listDisciplina;
	}
}
